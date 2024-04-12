package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	private static String rootPath 
	= System.getProperty("user.dir") + "\\files\\";
	private static String source
	= rootPath + "img.jpg";
	private static String target
	= rootPath + "img_buffered_copy.jpg";
	
	public static void main(String[] args) {
		System.out.println("원본:" + source);
		System.out.println("복제본:" + target);
		
		// 스트림 열기
		try(
			// 주스트림	
			InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);	
			// 보조 스트림
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
				) 
		{
	//   int data = 0;
			byte data[] = new byte[1024];  // 데이터를 저장하는 배열
			int size = 0;  // 읽어들인 데이터의 길이를 저장하는 변수
			
			while((size = bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + "바이트 복사했습니다.");
			}
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
