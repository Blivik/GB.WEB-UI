package org.example;


public class Triangle {
    void main(String[] args) {
        double s = triangleArea(5, 5, 3);
        System.out.println("Площадь треугольника" + " = " + s);
    }

    public static double triangleArea(int a, int b, int c) {

        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static boolean validSides(int a, int b, int c){
        return (a > 0 && b > 0 && c > 0);
    }
}
