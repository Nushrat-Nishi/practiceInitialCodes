package com.example.overrideAndextend;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        radius = 1.0;
        color = "RED";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}