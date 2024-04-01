package com.javaex.api.objectclass.rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangle a = new Rectangle(6, 4);
		Retangle b = new Rectangle(2, 12);
		Retangle c = new Rectangle(3, 3);
		Retangle d = c;
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(c));
	}

}
