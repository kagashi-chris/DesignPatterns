package com.zhen.designPatterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeRunner {

    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(shape1);
        shapeList.add(shape2);
        Picture picture = new SingleColorShifterPicture(shapeList);
        picture.drawPicture();
        picture.drawPicture();
        picture.drawPicture();

        Picture picture2 = new StaticPicture(shapeList);
        picture2.drawPicture();
        picture2.drawPicture();
        picture2.drawPicture();
    }
}
