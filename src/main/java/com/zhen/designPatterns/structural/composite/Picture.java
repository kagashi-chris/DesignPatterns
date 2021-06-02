package com.zhen.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture extends Shape{

    private List<Shape> shapeList = new ArrayList<>();
    private int id;

    public Picture(int id) {
        this.id = id;
    }

    @Override
    public void draw()
    {
        System.out.println("Drawing Picture: " + toString());
        for(Shape shape: shapeList)
        {
            shape.draw();
        }
    }

    @Override
    public void add(Shape shape)
    {
        shapeList.add(shape);
    }

    @Override
    public void remove(Shape shape)
    {
        shapeList.remove(shape);
    }

    @Override
    public Shape getChild(int i) {
        return shapeList.get(i);
    }

    @Override
    public String toString() {
        return "Picture{" +
                "shapeList=" + shapeList +
                ", id=" + id +
                '}';
    }
}
