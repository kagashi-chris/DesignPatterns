package com.zhen.designPatterns.structural.composite;

public class Square extends Shape{

    private int id;

    public Square(int id) {
        this.id = id;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + toString());
    }

    @Override
    public String toString() {
        return "Square{" +
                "id=" + id +
                '}';
    }
}
