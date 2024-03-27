package com.javaex.oop.point.v4;

// v2. 기본 생성자, 모든 필드 생성자
public class Point {
    // 필드 (은닉)
    private int x;
    private int y;

    // 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // x 좌표의 getter 및 setter 메서드
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // y 좌표의 getter 및 setter 메서드
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString 메서드 오버라이드
    @Override
    public String toString() {
        return "점 [x=" + x + ", y=" + y + "]";
    }
}