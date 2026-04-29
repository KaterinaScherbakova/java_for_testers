package ru.stqa.geometry.figures;

public class Triangle {

    double firstSide;
    double secondSide;
    double thirdSide;

    //добавлен конструктор для Triangle
    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    //принтер

    public String printTriangleArea() {

        String text = String.format("Площадь треугольника со сторонами %f,%f и %f  = %f", this.firstSide, this.secondSide, this.thirdSide, getArea());
        return text;
    }

    //вычисление площади треугольника

    public double getArea() {
        // Вычисление полупериметра
        double p = (this.firstSide+ this.secondSide + this.thirdSide) / 2.0;
        // Вычисление площади по формуле Герона
        return Math.sqrt(p * (p - this.firstSide) * (p - this.secondSide) * (p - this.thirdSide));
    }
    //вычисление периметра треугольника

    public double getPerimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }
}
