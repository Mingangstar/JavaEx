package com.javaex.basic.reftype;

import java.util.Arrays;

public class ArrayCopyEx {
		// 배열은 크기 변경 불가
	// 공간을 늘리고자 한다면 새 배열 생성 후 복사
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FOR 문을 이용한 배열 복사
	//	arrayCopyByFor();
		// System을 이용한 배열 복사
		arrayCopyBySystem();
	}
	
	public static void arrayCopyByFor() {
		int scores[] = {1,2,3}; // .length == 3
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		// 새 공간을 만들어 복사
		int target[] = new int[10];
		
		for (int i = 0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		// 배열 유틸리티 클래스를 이용한 출력
		System.out.println(Arrays.toString(target));
	}
	
	public static void arrayCopyBySystem() {
		int source[] = { 1, 2,3 };
		int target[] = new int[10];
		
		System.out.println("source: " + Arrays.toString(source));
		
		// 배열 복제
		System.arraycopy(source, 0, target, 3, source.length);
		
		System.out.println("target: " + Arrays.toString(target));
		
		// Enhanced For
		// for ( 추출된 데이터: 원본 배열 혹은 ㅓㄹ렉션)
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println();
	}
}
