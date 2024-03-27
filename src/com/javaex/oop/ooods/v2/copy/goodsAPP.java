package com.javaex.oop.ooods.v2.copy;

public class goodsAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		
		camera.setName(" nikon");
		camera.setPrice(400_000);
		
		Goods note = new Goods();
		note.setName("LG그램");
		note.setPrice(9000000);
		
		Goods mug = new Goods();
		mug.setName("머그컵");
		mug.setPrice(120000);
		
		
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n", camera.getName(), camera.getPrice());
		System.out.printf("%s, %,d원%n", note.getName(), note.getPrice());
		System.out.printf("%s, %,d원%n", mug.getName(), mug.getPrice());
		
		// 상품정보 출력 (메서드 활용)
		camera.showInfo();
		note.showInfo();
		mug.showInfo();
	}

}
