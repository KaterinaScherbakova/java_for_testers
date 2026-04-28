package ru.stqa.geometry.figures;

public class Triangle {
    public static void printTriangleArea(double a, double b, double c) {
        String text = String.format("Площадь треугольника со сторонами %f,%f и %f  = %f", a, b, c, getArea(a, b, c));
        System.out.println(text);
    }

    public static double getArea(double a, double b, double c) {
        // Вычисление полупериметра
        double p = (a + b + c) / 2.0;
        // Вычисление площади по формуле Герона
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

    public static double getPerimeter(double v, double v1, double v2) {
        return v + v1 + v2;
    }
}
