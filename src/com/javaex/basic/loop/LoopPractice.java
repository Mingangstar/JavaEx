package com.javaex.basic.loop;

public class LoopPractice {

	public static void main(String[] args) {
		//forGugu();
		//WhileGugu();
		//forStar();
		whileStar();
	}
	

	public static void forGugu( ) {
		for (int dan = 2; dan <= 9; dan ++) {
			//단수 돌리기: 2, 3, 4, ...9
			for (int num =1; num <= 9; num ++ ) {
			System.out.println(dan + "*" + 2 + "=" + 2 + dan * num);
			}
			
		}
	}
	
	public static void WhileGugu( ) {
		int dan =2, num = 1;
		
		while (dan <=9) {
			num = 1;
			while(num <= 9) {
			System.out.println(dan + "*" + 2 + "*" + num + "=" + dan * num  );
			num += 1;
		}
			dan += 1;
	  }
	}
		public static void forStar( ) {
			//행루프 1 ~ 6
			for (int row = 1; row <= 6; row ++) {
				//열루프 : 1~ 현재 row
				for (int col = 1; col <= row; col ++) {
					System.out.println("*");
				}
				System.out.println(); // 강제 개행
				
			}
		}
	
		public static void whileStar( ) {
			int row = 1, col;
			
			while (row <=6) {
				col = 1;
				// 행루프 : 1 ~ row
				while (col <= row) {
					System.out.print("*");
					col += 1;
				}
				System.out.println();
				row += 1;
			}
		
	}
}