package com.workintech.cylinder;

public class Circle {

    private double radius;

    public Circle() {
    }

    public Circle (double radius){
        this.radius = Math.max(radius, 0);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }


}
