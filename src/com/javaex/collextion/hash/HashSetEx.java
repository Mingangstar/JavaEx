package com.javaex.collextion.hash;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// 1. HashSet 사용법 (기본타입)
		usingHashSet();
		// 2. 집합 연산
		setOperation();
		// 3. HashSet 사용법 ( 객체 자료형 )
		

	}
	
	private static void usingHashSet() {
		// 선언
		HashSet<String> hs = new HashSet<>();
		
		// 요소 추가
		hs.add("JAva");
		hs.add("c");
		hs.add("Pyton");
		hs.add("Java");
		
		System.out.println("hs:" + hs);
		System.out.println("size:" + hs.size());
		
		// 특정 객체 포함 여부
		System.out.println("C++ 포함하?" + hs.contains("C++"));
		System.out.println("Linux 포람?" + hs.contains("Linux"));
		
		System.out.println("hs:" + hs);
		
		// 순서가 없음 : 객체로 삭제 하는 방법만 제공
		// 객체 삭제
		hs.remove("C++");
		System.out.println("hs:" + hs);
	}
	
	private static void setOperation() {
		// 집합 연산
		HashSet<Integer> numbers =
				new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println("전체집합:" + numbers);
		HashSet<Integer> odds =
				new HashSet<>(Arrays.asList(1, 3, 5, 7, 9));  // 홀수
		System.out.println("홀수집합:" + odds);
		HashSet<Integer> evens =
				new HashSet<>(Arrays.asList(2, 4, 6, 8, 10));  // 짝수
		HashSet<Integer> mThree =
				new HashSet<>(Arrays.asList(3, 6, 9));  // 3의 배수 집합
		System.out.println("3의배수집합:" + mThree);   
		
		// 교집합 : retainAll
		// 원본 보호를 위해 복제해서 사용
		System.out.println("======= 교집합");
		HashSet<Integer> setA = (HashSet<Integer>)odds.clone();
		HashSet<Integer> setB = (HashSet<Integer>)mThree.clone();
		System.out.println("집합A:" + setA);
		System.out.println("집합B:" + setB);
		
		setA.retainAll(setB);	// 집합A교집하뷰 = {3, 9}
		
		System.out.println("교집합:" + setA);
		System.out.println(setA.equals(new HashSet<Integer>(Arrays.asList(3, 9))));
		
		// ㅎ
	}
}
