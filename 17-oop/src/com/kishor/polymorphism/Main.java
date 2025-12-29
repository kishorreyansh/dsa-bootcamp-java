package com.kishor.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes circle1 = new Circle();
        shape.area();
        circle.area();
        circle1.area();
    }
}
