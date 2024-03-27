package com.javaex.basic.reftype;

public class MainArgs {
	// 배열 형태의 값 목록이 main 매서드로 전달
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] = %s%n", i, args[i]);
		}

	}

}
