package com.lessons.model.entity;

import com.lessons.model.Drawable;

public abstract class Shape implements Drawable {
    private String colorShape;

    public String getColorShape() {

        return colorShape;
    }

    public void setColorShape(String colorShape) {

        this.colorShape = colorShape;
    }

    public Shape(String colorShape) {

        this.colorShape = colorShape;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": colorShape = " + colorShape;
    }

    @Override
     public String draw() {
    return String.format("%s; area = %.2f\n", this, calcArea());
    }

    public abstract double calcArea();

    public abstract String errorMethod();


}
