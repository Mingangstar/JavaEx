package com.javaex.oop.methods;

public class MethEx {

	public static void main(String[] args) {
		// 매개변수 x, 리턴 x
	//	printMessage();
		//매개변수 x, 리턴 o
	//	String message = getMessage();
	//	System.out.println(message);
		// 매개변수 o, 리턴 x
	//	printDevide(4, 0);
		// 매개변수 o, 리턴 o
		//double sum = getSum(num1, num2);
		System.out.println(sum);

	}
	
	private static douvle getSum(doble num1, double num2) {
		System.out.println("매개변수 있고, 리턴도 있는 메서드");
		return num1+num2;
	}
	
	private static void printDevide(int num1, int num2) {
		// 리턴 타입이 없어도 리턴 할 수 있다
		// 남은 코드를 더 이상 수행하지 않고 제어를 돌려줄 때
		System.out.println("매개변수 있고, 리턴 없는 메서드");
		if (num2 == 0) {
			System.out.println("0으로 나눌 없습니다");
		}
		System.out.printf("%d / %d = %d%n", num1, num2, num1/num2);
	}
	private static String getMessage() {
		return "매개변수 없지만 리턴은 있는 메서드";	
	}
	
	private static void printMessage() {
		// 매개변수 x
		// 리턴 x -> void
		System.out.println("매개변수 없고, 리턴도 없는 메서드");
	}

}
