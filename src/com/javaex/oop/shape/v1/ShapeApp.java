package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// Shape s = new Shape(); // 추상 클래스의 직접 객체화 불가
		
		// 추상 클래스를 상속 받은 클래스는 직접 객체화 가능
		Circle c = new Circle(10, 20, 30);
		c.draw();
		
		Rectangle r = new Rectangle(10, 20, 100, 500);
		r.draw();

	}

}
