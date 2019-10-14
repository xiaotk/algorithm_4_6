package com.crazy16.algorithm_4_6.algorithm;


public class Rectangle extends Shape {
    private double n;
    private double m;

    @Override
    public double calArea() {
        return n*m;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public Rectangle() {
    }

    public Rectangle(double n, double m) {
        this.n = n;
        this.m = m;
    }
}
