package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요\n숫자:");
		int number = scanner.nextInt();
		
		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
	} else if (number < 0) {
		System.out.println("음수입니다.");
	} else {
		System.out.println("0입니다.");
	}
		scanner.close();
  }
}