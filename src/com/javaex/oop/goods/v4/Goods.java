package com.javaex.oop.goods.v4;

// v4. this
// 현재 자기 자신의 객체를 의미
// this() : 현재 클래스 내부의 다른 생성자를 호출할 때 사용
public class Goods {
	//필드 선언
	// instance 영역
	private String name; // 상품명
	private int price; // 가격
	
	//name 필드 생성자
	public Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	// 전체 필드 생성자
	public Goods(String name, int price) {
		//객체 초기화를 담당	
		this(name); // -> Goods(String name) 생성자 호출
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
	}
	
	// Getter Setter
	// Setter가 없으면 Read Only 필드를 만들수 있고
	// Getter / Setter 모두 없으면 프아이빗 필드가 된다
	
	public String setName() {
		// 메서드 영역
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
