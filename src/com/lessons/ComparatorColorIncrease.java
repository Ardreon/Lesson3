package com.lessons;

import java.util.Comparator;

public class ComparatorColorIncrease implements Comparator {
    @Override
    public int compare(Object o1, Object o2){
        String sh1 = ((Shape)o1).getColorShape();
        String sh2 = ((Shape)o2).getColorShape();
        return sh1.compareTo(sh2);

    }
}
