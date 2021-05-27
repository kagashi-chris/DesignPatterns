package com.zhen.designPatterns.structural.bridge;

public abstract class Shape {

    protected Color color = Color.BLACK;

    public abstract String draw();

    public abstract Color shiftToNextColor();
}
