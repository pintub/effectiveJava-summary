package com.sf.effectivejava.item23;

abstract class FigureHierarchy {
    abstract double area();
}

class Circle extends FigureHierarchy {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (radius *
                radius);
    }
}

class Rectangle extends FigureHierarchy {
    final double length;
    final double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
