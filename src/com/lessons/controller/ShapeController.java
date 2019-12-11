package com.lessons.controller;

import com.lessons.model.ComparatorSIncrease;
import com.lessons.model.ShapeModel;
import com.lessons.view.InputData;
import com.lessons.view.ShapeView;
import com.lessons.model.ComparatorColorIncrease;

import java.util.Comparator;


public class ShapeController {
    private ShapeModel model = new ShapeModel();
    private ShapeView view = new ShapeView();

    public void run() {
        view.viewData(ConvertInString.convertArrayShapes(model.getShapes()));
        view.viewData(ConvertInString.convertDouble(model.getTotalAreaShapes(), "Total area"));

        view.viewData("Enter type shape -> ");
        String type = InputData.input();
        view.viewData(ConvertInString.convertDouble(model.getAreaShapeByType(type), type + " area: "));
        view.viewData("------------------------------------------------\n");

        view.viewData("Enter criteria sorting (area or color) -> ");
        String criteria = InputData.input().toLowerCase();
        Comparator comparator = null;
        switch (criteria) {
            case "area":
                comparator = new ComparatorSIncrease();
                break;
            case "color":
                comparator = new ComparatorColorIncrease();
                break;
        }
        if (comparator != null) {
            view.viewData(ConvertInString.convertArrayShapes(model.sortShapes(comparator)));
        } else view.viewData("Invalid criteria!!!");

    }
}
