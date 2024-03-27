package com.javaex.oop.methods;

public class MethodEx2 {
    // 가변인수 : 정해지지 않은 개수의 인수가 넘어올 때
    public static void main(String[] args) {
        // 방법 1 : 배열로 전달하는 방법
        System.out.println("getSumArr:" + getSumArr(new double[]{1,2,3,4,5,6,7,8,9,10}));
        // 방법 2 : 가변인수 사용법
        System.out.println("getSumVarArgs:" + getSumVarArgs(1,2,3,4,5,6,7,8,9,10));
    }
    
    // 배열을 이용한 여러 개의 데이터 전달
    private static double getSumArr(double[] values) {
        double total = 0;
        for (int i = 0; i < values.length; i++) { // 배열의 길이만큼 반복
            total += values[i];
        }
        return total; // 총합 반환
    }

    // 가변인수를 이용한 여러 개의 데이터 전달
    private static double getSumVarArgs(double... values) {
        double total = 0;
        for (double value : values) { // values 배열의 모든 요소에 대해 반복
            total += value;
        }
        return total; // 총합 반환
    }
}