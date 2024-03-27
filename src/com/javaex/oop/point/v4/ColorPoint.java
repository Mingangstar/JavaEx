package com.javaex.oop.point.v4;

// 상속 extends
public class ColorPoint extends Point {
	// 필드
	private String color;

	//생성자
	public ColorPoint(String color) {
		this.color = color;
		
		// 생성자 
		public ColorPoint(String color) {
			// 생성자 내에서 부모 생성자를 호풀하지 않으면 부모의 기본 생성자를 호출
			super(0, 0);
			this.color = color;
		}
		
		public ColorPoint(int x, int y, String color) {
			super(x, y); // 부모 생성자 호출
			this.color = color;
		}
		
		// getters/setters
		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this color = color;		
		}
		
		@Override // 현재 메서드가 Overrid인지 확인
		public void draw( ) {
			// getter 이용 우회접근
			System.out.printf("색깔점[x=%d, y=%d, color=%s] 점을 찍었습니다.%n", super.getX(), getY(), color);
		}
		
		@Override
		public void test() {
			
		}
		
	}
}
