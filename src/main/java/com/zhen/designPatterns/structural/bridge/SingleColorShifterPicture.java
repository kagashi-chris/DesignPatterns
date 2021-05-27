package com.zhen.designPatterns.structural.bridge;

import java.util.List;

public class SingleColorShifterPicture extends Picture{


    public SingleColorShifterPicture(List<Shape> shapeList) {
        super(shapeList);
    }

    @Override
    public void drawPicture() {
        for(Shape shape:shapeList)
        {
            shape.shiftToNextColor();
            System.out.println(shape.draw());
        }
    }
}
