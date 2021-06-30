package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in m: ");
        double height = scanner.nextDouble();
        scanner.close();

        double index = weight / (height * height);

        if(index < 18.5 || index > 24.9) {
            System.out.println("BMI not optimal");
        }
        else {
            System.out.println("BMI optimal");
        }
    }
}
