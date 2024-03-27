package com.javaex.oop.ooods.v2.copy;

// v2. private
public class Goods {
	//필드 선언
	// instance 영역
	private String name; // 상품명
	private int price; // 가격

	// Getter Setter
	public String setName() {
		// 메서드 영역
		int test = 0;
		return name;
	}
    public String getName() {
        return name;
    }
	
	public void setName (String name) {
		this.name = name;
	}
	public int getPrice () {
		return price;
	}
	public void setPrice(int price) {
		//gerrer/setter를 활용하면 무결성 체크
		if (price < 0) {
		this.price = price;
	}   else {
		this.price = price; 
	}
		
	}
	
	// 일반 매서드
	public void showInfo() {
		System.out.printf("상품 이름 : %s%n가격: %,d%n", name, price);
	}
}
