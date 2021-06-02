package com.zhen.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private List<Shape> shapeList = new ArrayList<>();

    public void draw()
    {
        System.out.println("draw nothing");
    };
    public void add(Shape shape)
    {
        shapeList.add(shape);
    };
    public void remove(Shape shape)
    {
        shapeList.remove(shape);
    }
    public Shape getChild(int i)
    {
        return shapeList.get(i);
    }
}
