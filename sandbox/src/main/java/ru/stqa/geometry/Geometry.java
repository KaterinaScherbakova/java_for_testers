package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(4.0));
        Square.printSquareArea(new Square(7.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(6.0, 5.0);
        Rectangle.printRectangleArea(1.0, 5.0);

        Triangle.printTriangleArea(5.0, 3.0, 7.0);
        Triangle.printTriangleArea(1.0, 2.0, 1.0);


    }

}
