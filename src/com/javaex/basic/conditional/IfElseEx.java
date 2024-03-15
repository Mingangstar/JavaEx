package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEx {
		// 정수 입려, 60점 이상이면 합격이	입니다 출력
		// Tip : Ctrl + Space (자동 임프트)
		//		Ctrl + Shift + O (Organize Imports)
	public static void main(String[] args) {
		// 스태너 열기
		Scanner scanner = new Scanner(System.in);
		// 점수 입력 받기
		System.out.print("점수는?");
		int score = scanner.nextInt();
		
		// 점수 비교
		if (score >= 60) {
			// 조건을 만족했을 떼
			System.out.println("합격입니다.");
		} else {
			//조건을 만족하지 않았을 때
			System.out.println("불합격입니다.");			
		}
		// 스캐너 닫기
		scanner.close();
	}

}
