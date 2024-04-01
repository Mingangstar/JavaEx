package com.javaex.api.objectclass.circle;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			//	전달 받은 파라미터 obj가 Point 인지 확인			
			// Obj -> Circle로 캐스팅
			Circle other = (Circle)obj;
			// 두 객체의 동등성
			// 두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다
	//		return x == other.x && y == other.y;
			
				return radius == other.radius;
			} 
				return super.equals(obj);
		}
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ",radius]";
	}
	
}
