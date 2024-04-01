package com.javaex.api.objectclass.circle;

public class CircleApp {

	public static void main(String[] args) {
		Circle a = new Circle(6, 4, 10);
		Circle b = new Circle(2, 12, 10);
		Circle c = new Circle(3, 3, 12);
		Circle d = c;
		
		System.out.println(a.equals(b));	// true
		System.out.println(a.equals(c)); 	// false
		System.out.println(a.equals(d));	// false
		System.out.println(a.equals(c));    // true
	}

}
