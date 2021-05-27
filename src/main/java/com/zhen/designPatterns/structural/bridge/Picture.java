package com.zhen.designPatterns.structural.bridge;

import java.util.List;

public abstract class Picture {

    List<Shape> shapeList;

    public Picture(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public abstract void drawPicture();
}
