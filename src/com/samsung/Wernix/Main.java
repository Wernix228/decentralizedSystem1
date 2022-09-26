package com.samsung.Wernix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Введите первое значение: ");
            double a = sc.nextDouble();
            System.out.print("Введите второе значение: ");
            double b = sc.nextDouble();

        if(a > 0 && b > 0){
            System.out.println("Площадь квадрата: " + squareArea(a));
            System.out.println("Периметр квадрата: " + squarePer(a));
            System.out.println("Площадь прямоугольника: " + rectangleArea(a,b));
            System.out.println("Периметр прямоугольника: " + rectanglePer(a,b));
        }else System.out.println("Недопустимые значения");
    }
    public static double squareArea(double a) {
        return Math.pow(a, 2); 
    }
    public static double squarePer(double a){
        return a * 4;
    }
    public static double rectangleArea(double a, double b){
        return a * b;
    }
    public static double rectanglePer(double a, double b){
        return (a + b) * 2;
    }

}
