package com.lessons.model;

import com.lessons.model.entity.Shape;

import java.util.Comparator;

public class ComparatorSIncrease implements  Comparator{


@Override
public int compare(Object o1, Object o2){
        Shape sh1 = (Shape) o1;
        Shape sh2 = (Shape) o2;
        if (sh1.calcArea() < sh2.calcArea()) return -1;
        if (sh2.calcArea() > sh2.calcArea()) return 1;
        return 0;

    }


}
