package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    public void calculateArea() {
        double result = Triangle.getArea(5.0, 3.0, 7.0);
        Assertions.assertEquals(6.495191, result, 0.001);
    }
    
    @Test
    public void calculatePerimeter() {
        double result = Triangle.getPerimeter(5.0, 3.0, 7.0);
        Assertions.assertEquals(15.0, result, 0.001);
    }
}
