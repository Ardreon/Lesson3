package com.lessons.model;

import com.lessons.model.entity.Shape;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeModel {
    private Shape[] shapes;

    public ShapeModel() {
        shapes = DataSourceShapes.getArrayShapes();
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double getTotalAreaShapes(){
        double sum = 0.0;
        for(Shape elem : shapes){
            sum += elem.calcArea();
        }
        return sum;
    }

    public double getAreaShapeByType(String type){
        double sum = 0.0;
        for(Shape elem : shapes) {
            if (elem.getClass().getSimpleName().equalsIgnoreCase(type)) {
                sum += elem.calcArea();
            }
        }
        return sum;
    }

    public Shape[] sortShapes(Comparator comparator){
        Shape[] newShapes = Arrays.copyOf(shapes, shapes.length);
        Arrays.sort(newShapes, comparator);
        return newShapes;
    }

}
