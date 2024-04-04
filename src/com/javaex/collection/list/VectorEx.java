package com.javaex.collection.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터 선언
		Vector v = new Vector();	// 기본 벡터 버퍼 용량 10
		System.out.println("Size:" + v.size() + ", Capacity:" + v.capacity());
		
		for (int i = 0; i < 10; i++) {
			// 요소 추가
			v.addElement(i);	// auto boxing
		}
		
		System.out.println("Sizw:" + v.size() +
				", Capacity:" + v.capacity());
		
		// 허용량 초과
		v.addElement(10);
		
		System.out.println("Sizw:" + v.size() +
				", Capacity:" + v.capacity());
		
		// 조회 : elementAt
		int val = (Integer)v.elementAt(5); // elementAt -> Object 리턴
		System.out.println(".elementAt(5):" + val);
		
		// 역참조(검색)
		// 갹채의 인덱스 조회 
		System.out.println(".indexOf(5):" + v.indexOf(5));
		System.out.println(".indexoF(20):" + v.indexOf(20));	 
		// 없는 객체 -1
		
		// 객체 포함 여부 : .contains
		System.out.println(".contains(7):" + v.contains(7));	// true
		System.out.println(".contains(20):" + v.contains(20));	// falsw
		
		// 삭제 : .removElement
		v.removeElement(7);
		
		for (int i =0; i < v.size(); i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.println(item + " ");
		}
		System.out.println();
		
		System.out.println("Sizw:" + v.size() +
				", Capacity:" + v.capacity());
		
		// Generic을 사용하여 코드 개선 가능
		// 예) Number를 상속한 모든 객체를 담을 수 있는 Generic을 사용
		Vector<Integer> v2 = new Vector<>(); // Number 상속받은 클래스만 저장
		v2.addElement(Integer.valueOf(2024));
		v2.addElement(Float.valueOf(3.14159f));
	//	v2.addElement("Vector);  // String은 Number를 상속
	}

}
