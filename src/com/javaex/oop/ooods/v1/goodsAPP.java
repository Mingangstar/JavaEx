package com.javaex.oop.ooods.v1;

public class goodsAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		camera.name = " nikon";
		camera.price = 400_000;
		
		Goods note = new Goods();
		note.name = "LG그램";
		note.price = 9000000;
		
		Goods mug = new Goods();
		mug.name = "머그컵";
		mug.price = 120000;
		
		
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n", camera.name,camera.price);
		System.out.printf("%s, %,d원%n", note.name,note.price);
		System.out.printf("%s, %,d원%n", mug.name,mug.price);
		
	}

}
