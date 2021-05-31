package com.zhen.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeDirectory implements Shape{

    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public void drawShape()
    {
        for(Shape shape: shapeList)
        {
            shape.drawShape();
        }
    }

    public void addShape(Shape shape)
    {
        shapeList.add(shape);
    }

    public void removeShape(Shape shape)
    {
        shapeList.remove(shape);
    }
}
