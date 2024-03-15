package com.javaex.basic.operators;

public class BitOperEx {

	public static void main(String[] args) {
		// 비트 연산자 연습
//		bitOperTest();
		// 비트 시프트 연산자
		bitShiftTest();

	}
	
	public static void bitShiftTest() {
		int val = 1;
		System.out.println(val);
		
		// 왼쪽으로 1비트 이동
		System.out.println(
				Integer.toBinaryString(val << 1));
		// 완쪽로 4비트 이동
		System.out.println(
				Integer.toBinaryString(val << 4));
		
		int val2 = 0b1000;
		System.out.println(val2);
		// 오른쪽 1비트 이동
		System.out.println(
				Integer.toBinaryString(val2 >> 1));		
		// 오른쪽 3비트 이동
		System.out.println(
				Integer.toBinaryString(val2 >> 3));
		
	}
	
	public static void bitOperTest() {
		// 비트 연산자
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // 비트 논리곱
		System.out.println(
				Integer.toBinaryString(result));
		result = b1 | b2;	//비트 논리합
		System.out.println(
				Integer.toBinaryString(result));
		result = b1 ^ b2;
		System.out.println(							//
				Integer.toBinaryString(result));
		result = ~ b2;							// 비트 NOT
		System.out.println(
				Integer.toBinaryString(result)); 	// 이진 출력
		
	}

}
