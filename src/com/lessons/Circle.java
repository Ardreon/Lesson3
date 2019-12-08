package com.lessons;

public class Circle extends Shape {
    private double radius;

    public Circle(String colorShape, double radius) {
        super(colorShape);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.1415 * 2 * radius;
    }


    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area = %.2f\n", this, calcArea());
    }

    //Этот метод не вызывается
    public String errorMethod(){
        return "No errors";
    }

}