package JavaTechnoStudy.day8;


import java.util.Scanner;

public class Task6 {

    // Write a Java program to compute body mass index (BMI).
    // BMI: The BMI is defined as the body mass divided by the square of the body height,
    //      and is universally expressed in units of kg/m2,
    //      resulting from mass in kilograms and height in metres.

    public static void main(String[] args) {

        // 1. Way
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your weight in kilogram: ");
        double weight = scan.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = scan.nextDouble();

        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) is " + BMI + " kg/m2");

        // 2. Way
        Scanner input = new Scanner(System.in);

        System.out.print("Provide weight in kg: ");
        double kg = input.nextDouble();

        System.out.print("Provide height in m: ");
        double m = input.nextDouble();

        double BMI1 = kg / (m * m);
        System.out.print("Body Mass Index is: " + BMI1);

    }

}


