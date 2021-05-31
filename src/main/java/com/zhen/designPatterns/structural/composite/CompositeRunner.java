package com.zhen.designPatterns.structural.composite;

public class CompositeRunner {

    public static void main(String[] args) {
        Square lotsOfSquares = new Square("LotsOfSquares");
        Square notALotOfSquares = new Square("NotALotOfSquares");
        ShapeDirectory squareDirectory = new ShapeDirectory();
        squareDirectory.addShape(lotsOfSquares);
        squareDirectory.addShape(notALotOfSquares);

        Square aBillionSquares = new Square("BillionsOfSquares");
        ShapeDirectory billionSquareDirectory = new ShapeDirectory();
        billionSquareDirectory.addShape(aBillionSquares);
        squareDirectory.addShape(billionSquareDirectory);

        Circle lotsOfCircles = new Circle("LotsOfCircles");
        Circle notALotOfCircles = new Circle("NotALotOfCircles");
        ShapeDirectory circleDirectory = new ShapeDirectory();
        circleDirectory.addShape(lotsOfCircles);
        circleDirectory.addShape(notALotOfCircles);

        ShapeDirectory mainDirectory = new ShapeDirectory();
        mainDirectory.addShape(squareDirectory);
        mainDirectory.addShape(circleDirectory);

        mainDirectory.drawShape();
    }


}
