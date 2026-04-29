package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    public void calculateArea() {
        var s = new Triangle(5.0, 3.0, 7.0);
        double result = s.getArea();
        Assertions.assertEquals(6.495191, result, 0.001);
    }
    
    @Test
    public void calculatePerimeter() {
        var s = new Triangle(5.0, 3.0, 7.0);
        double result = s.getPerimeter();
        Assertions.assertEquals(15.0, result, 0.001);
    }
}
