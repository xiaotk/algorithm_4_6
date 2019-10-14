package com.crazy16.algorithm_4_6.algorithm;

public class Circle extends Shape {
    private double n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public Circle() {
    }

    public Circle(double n) {
        this.n = n;
    }

    @Override
    public double calArea() {
        return n * n * Math.PI;
    }

}
