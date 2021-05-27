package com.zhen.designPatterns.structural.bridge;

public class Circle extends Shape{

    int colorIndex = 0;
    Color[] colorsToShiftBetween = {Color.RED, Color.BLUE, Color.GREEN};
    public Circle() {
        this.color = colorsToShiftBetween[0];
    }

    @Override
    public String draw() {
        return "Circle drawn " + color.name();
    }

    @Override
    public Color shiftToNextColor() {
        colorIndex++;
        if(colorIndex == colorsToShiftBetween.length)
        {
            colorIndex = 0;
        }
        this.color = colorsToShiftBetween[colorIndex];
        return color;
    }
}
