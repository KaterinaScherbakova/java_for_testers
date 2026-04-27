package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7);
        Square.printSquareArea(3);
        Square.printSquareArea(2);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(6.0, 5.0);
        Rectangle.printRectangleArea(1.0, 5.0);

    }

}
