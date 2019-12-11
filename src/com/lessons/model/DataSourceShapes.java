package com.lessons.model;

import com.lessons.model.entity.Circle;
import com.lessons.model.entity.Rectangle;
import com.lessons.model.entity.Shape;
import com.lessons.model.entity.Triangle;

public class DataSourceShapes {
    public static Shape[] getArrayShapes(){
        return new Shape[] {
                new Rectangle("RED", 10, 4),
                new Circle("YELLOW", 6),
                new Triangle("BLACK", 4.5, 6, 4),
                new Circle("BlUE", 4),
                new Rectangle("YELLOW", 6, 14),
                new Triangle("GREEN", 5, 6, 7),
                new Rectangle("BLACK", 8, 2),
                new Circle("GREY", 15),
                new Triangle("BROWN", 10, 12, 15),
                new Rectangle("YELLOW", 6, 14)
        };
    }
}
