package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount; // 클래스 변수
	// -> 생성된 모든 인스턴스의 개수
	public static String classVar; // 클래스 변수
	public String intanceVar; // 인스턴스 변수
	
	
	// 스태틱 블록으로 클래스 변수 초기화
	static {
		 refCount = 0; // 스태틱 변수 초기화
		 classVar = "Static Member"; // 클래스 변수 접근
//		 intanceVar = "Instance Member";
		 	//인스턴스 변수로의 접근은 불가
		 	// static 영역에서는 static 영역만 접근 가능
		 System.out.println("클래스 영엵 초기화");
		
	}
	
	// 생성자
	public StaticEx() {
		// 인스턴스가 생성될 때 객체 카운트를 증가
		refCount ++;
		System.out.println("refCount:" + refCount);
		System.out.println("Instance 생성!");
	}

}
