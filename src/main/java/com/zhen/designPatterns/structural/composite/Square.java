package com.zhen.designPatterns.structural.composite;

public class Square implements Shape{

    private String shape = "square";
    private String squareName;

    public Square(String squareName) {
        this.squareName = squareName;
    }

    @Override
    public void drawShape() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Square{" +
                "shape='" + shape + '\'' +
                ", squareName='" + squareName + '\'' +
                '}';
    }
}
