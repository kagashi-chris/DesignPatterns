package com.zhen.designPatterns.structural.bridge;

public class Square extends Shape{

    int colorIndex = 0;
    Color[] colorsToShiftBetween = {Color.WHITE,Color.BLACK};
    public Square() {
        this.color = colorsToShiftBetween[0];
    }

    @Override
    public String draw() {
        return "Square drawn " + color.name();
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
