package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//   v2. 클라이언트로부터 메세지 전달 -> Echo Back
public class Server {

   public static void main(String[] args) {
      // 서버 소켓 생성
      ServerSocket serverSocket = null;

      try {
         // IP와 포트에 연결 : bind
         serverSocket = new ServerSocket();
         InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
         serverSocket.bind(local);

         System.out.println("<서버가 시작되었습니다.>");
         System.out.println("[연결을 기다립니다.]");

         // 연결 대기
         Socket socket = serverSocket.accept();

         // 클라이언트 접속시의 처리
         InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
         System.out.println("[클라이언트가 연결되었습니다.]");
         System.out.println(socketAddress.getAddress() + ":" + socketAddress.getPort());

         // 후처리
         System.out.println("================");
         System.out.println("<서버 종료>");
         // 접속 허용
      } catch (IOException e) {

      } finally {
         // 시스템 자원 해체
         try {
            serverSocket.close();

         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

}