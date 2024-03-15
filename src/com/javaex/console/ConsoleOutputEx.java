package com.javaex.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.println : 출력 후 개행
		// System.out.prtint : 출력 후 개행 안한
		// System.out.printf : 형식 지정 문자열 출력
		System.out.print("Hello");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2);
		
		//	이스케이프 문자
		// \n (개행), \t (행), \" (인용부호). \\(\)
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello,\"Java\"");
		
		String path = "C:\\Users\\Hong\\memo.txt";
		System.out.println(path);

	}

}
