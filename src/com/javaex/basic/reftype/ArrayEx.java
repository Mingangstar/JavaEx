package com.javaex.basic.reftype;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 생성하는 여러가지 방법
		String[] names; // 타입[] 식별자
		int scores[]; // 타입 식별자[]
		
		// 초기화
		names = new String[] {
			"김", "이","박","정"
			}; // new 키워드로 기본값과 함께 생성

			float height[] = {
					175.5f,
					170.2f,
					180,3f,
					165.2f
			}; // 값 목록을 가지고 있을 때,
			
			// 값을 가지고 있지 않고, 공간의 개수만 알고 있을때
			scores = new int[4]; // 공간의 개수 명시
			// 인덱스 0부터 
			// 총 길이 .length - 1
			
			scores[0] = 80;
			scores[1] = 90;
			scores[2] = 85;
			scores[3] = 88;
		//	scores[4] = 100;	// IndexOutIfBounds
			
			for (int i = 0; i < names.length; i++) {
				// 총길이는 . ㅣ둫소 -1
				System.out.printf("%s (%.2f) : score = %d%n",
				names[i],
				height[i],
				scores[i]);
			}
			
	}

}
