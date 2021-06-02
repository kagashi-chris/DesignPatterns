package com.zhen.designPatterns.structural.composite;

public class CompositeRunner {

    public static void main(String[] args) {
        Shape circle = new Circle(0);
        circle.draw();

        Shape square = new Square(1);
        square.draw();

        Picture picture = new Picture(2);
        picture.add(circle);
        picture.add(square);
        picture.draw();

        Picture picture2 = new Picture(3);

        Shape square4 = new Square(4);
        picture2.add(square4);

        picture2.add(picture);
        picture2.draw();
    }


}
