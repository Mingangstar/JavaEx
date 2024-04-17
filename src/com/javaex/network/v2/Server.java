package com.javaex.network.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//	v2. 클라이언트로부터 메시지 전달 -> Echo Back 
public class Server {

	public static void main(String[] args) {
		//	서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
			//	ip와 포트에 연결 : bind
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 
					10000);
			serverSocket.bind(local);
		
			System.out.println("<서버가 시작되었습니다>");
			System.out.println("[연결을 기다립니다]");
			
			//	연결 대기
			Socket socket = serverSocket.accept();
			
			//	클라이언트 접속시의 처리
			InetSocketAddress socketAddress
				= (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.println(socketAddress.getAddress() + ":"
					+ socketAddress.getPort());
			
			//	클라이언트로부터 데이터 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//	Echo Back을 위한 OS 열기
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			//	클라이언트로부터의 메시지를 읽고 Echo Back
			String msg;
			while(true) {
				msg = br.readLine();	//	줄단위 입력
				
				if (msg == null) {	//	읽어들일 데이터가 없다
					System.out.println("[접속 종료되었습니다.]");
					break;
				}
				
				System.out.println("메시지:" + msg);
				//	Echo Back
				System.out.println("Echo Back:" + msg);
				bw.write("[Echo]:" + msg);
				bw.newLine();	//	개행
				bw.flush();

			}
			
			bw.close();
			br.close();
			//	후처리
			System.out.println("=========");
			System.out.println("<서버 종료>");
		//	접속 허용
		} catch (IOException e) {
			
		} finally {
			//	시스템 자원 해제
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}