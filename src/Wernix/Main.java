package Wernix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое значение: ");
        double a = sc.nextDouble();
        System.out.print("Введите второе значение: ");
        double b = sc.nextDouble();

        if(a == (double)a && b == (double)b) {
            double squareArea = Math.pow(a, 2);
            double squarePer = a * 4;
            double rectangleArea = a * b;
            double rectanglePer = (a + b) * 2;

            System.out.println("Площадь квадрата: " + squareArea);
            System.out.println("Периметр квадрата: " + squarePer);
            System.out.println("Площадь прямоугольника: " + rectangleArea);
            System.out.println("Периметр прямоугольника: " + rectanglePer);
        }
    }
}
