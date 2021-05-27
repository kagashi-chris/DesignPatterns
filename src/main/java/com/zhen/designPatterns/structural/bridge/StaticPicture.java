package com.zhen.designPatterns.structural.bridge;

import java.util.List;

public class StaticPicture extends Picture{

    public StaticPicture(List<Shape> shapeList) {
        super(shapeList);
    }

    @Override
    public void drawPicture() {
        for(Shape shape:shapeList)
        {
            System.out.println(shape.draw());
        }
    }
}
