package com.zhen.designPatterns.structural.composite;

public class Circle extends Shape{

    private int id;

    public Circle(int id) {
        this.id = id;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                '}';
    }
}
