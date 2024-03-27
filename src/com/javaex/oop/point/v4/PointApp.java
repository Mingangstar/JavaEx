package com.javaex.oop.point.v4;

public class PointApp {
    public static void main(String[] args) {
        Point point1 = new Point(5, 5);
        Point point2 = new Point(10, 23);

        draw(point1);
        draw(point2);
        
        ColorPoint cp = new ColorPoint();
        
        cp.draw();wef
    }

    public static void draw(Point point) {
        System.out.println(point + "을 그렸습니다.");
    }
}