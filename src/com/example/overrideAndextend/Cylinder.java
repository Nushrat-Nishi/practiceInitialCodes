package com.example.overrideAndextend;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

  @Override    
    public double getArea() {
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }
}