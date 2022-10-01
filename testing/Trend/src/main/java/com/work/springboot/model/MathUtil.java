package com.work.springboot.model;

public class MathUtil {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int subtract(int num1,int num2){
        return num1-num2;
    }
    public int multiply(int num1,int num2){
        return num1*num2;
    }
    public int divide(int num1,int num2){
        return num1/num2;
    }
    public double computeCircleArea(double radius){
        double r2 = radius * radius;
        return Math.PI * r2;
    }
}
