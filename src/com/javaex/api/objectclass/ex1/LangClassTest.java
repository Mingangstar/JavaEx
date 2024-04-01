package com.javaex.api.objectclass.ex1;

public class LangClassTest {

	public static void main(String[] args) {
		// Object 클래스의 기본 메서드들
		Point p = new Point(10, 10);
		
		// Java의 최상위 클래스는 Object => 모든 기본 기능을 물려받음
		System.out.println(p.getClass().getName()); // 클래스 이름 반환
		System.out.println(p.hashCode());			// hashCode -> 객체 식별값
		System.out.println(p.toString());		// 객체 내용을 문자열로 출력 가능
		System.out.println(p);
		
		// p의 부모 객체 정보 확인
		System.out.println(p.getClass()				// 현재 클래스 정보
							.getSuperclass()		// 부모 클래스 정보
							.getName());			// 이름 확인
		
		Point p2 = new Point(10,10);
		System.out.println(p2.hashCode());			// haschCode
	}

}
