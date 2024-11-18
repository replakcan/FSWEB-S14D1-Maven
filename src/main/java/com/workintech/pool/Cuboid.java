package com.workintech.pool;

public class Cuboid extends Rectangle {

    private float height;

    public float getHeight() {
        return Math.max(this.height, 0);
    }

    public Cuboid(float length, float width, float height) {
        super(length, width);
        this.height = height;
    }

    public float getVolume() {
        return this.height * super.getArea();
    }
}
