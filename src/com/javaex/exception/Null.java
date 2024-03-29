package com.javaex.exception;

public class Null {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3,6,9};
		
		try {
		System.out.println(intArray[3]);
	} catch (ArrayIndexOutOfBoundsException e) {
		// e.printStackTrace();
		System.out.println("Error:" + e.getMessage());
	} finally {
		System.out.println("예외처리 종료!");
	}

  }
}
