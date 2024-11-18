package com.workintech.pool;

public class Rectangle {

    private float width;
    private float length;

    public Rectangle(float width, float length) {
        this.length = length;
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public float getArea() {
        return this.width * this.length;
    }
}
