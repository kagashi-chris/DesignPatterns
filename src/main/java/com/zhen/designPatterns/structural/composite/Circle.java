package com.zhen.designPatterns.structural.composite;

public class Circle implements Shape{

    private String shape = "circle";
    private String circleName;

    public Circle(String circleName) {
        this.circleName = circleName;
    }

    @Override
    public void drawShape() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shape='" + shape + '\'' +
                ", circleName='" + circleName + '\'' +
                '}';
    }
}
