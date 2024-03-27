package com.javaex.basic.loop;

public class BreakEx {
	// 6과 14로 모두 나누어 떨어지는 숫자 찾기
	// 반복 횟수를 정확히 알기 힘듬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		while(true) {
			if (num % 6 == 0 && num % 14 == 0) {
				break;
			}
			num += 1;
		}
		System.out.println(num);
	}

}
