package com.javaex.api.objectclass.rectangle;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return super.equals(obj);
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ",radius]";
	
	
	}
}
