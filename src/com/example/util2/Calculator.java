package com.example.util2;

public class Calculator {
    public int divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value = cal.divide(100, 10);
        System.out.println(value);
    }
}