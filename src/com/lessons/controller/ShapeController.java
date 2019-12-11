package com.lessons.controller;

import com.lessons.model.ShapeModel;
import com.lessons.view.ShapeView;
import com.lessons.model.ComparatorColorIncrease;


public class ShapeController {
    private ShapeModel model = new ShapeModel();
    private ShapeView view   = new ShapeView();

    public void run() {
        view.viewData(ConvertInString.convertArrayShapes(model.getShapes()));
        view.viewData(ConvertInString.convertDouble(model.getTotalAreaShapes(), "Total area"));
        view.viewData(ConvertInString.convertDouble(model.getAreaShapeByType("Circle"), "Circle area: "));
        view.viewData("------------------------------------------------\n");
        view.viewData("Sort:\n");
        view.viewData(ConvertInString.convertArrayShapes(model.sortShapes(new ComparatorColorIncrease())));

    }

}
