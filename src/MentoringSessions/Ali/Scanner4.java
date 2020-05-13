package MentoringSessions.Ali;

import java.util.Scanner;

public class Scanner4 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //Task1: Create one int and enter your monthly spend, print the number

        System.out.println("Enter your monthly spend");
        int monthlySpend = s1.nextInt();
        System.out.println("Your monthly spend is " + monthlySpend);

        // String, int was taught, now:
        // double
        System.out.println("Enter monthly spend in decimal ");
        double monthlySpendDouble = s1.nextDouble();
        System.out.println("Your monthly spend in decimal " + monthlySpendDouble);

        //Task2: create one double and which is salary and print that salary
        System.out.println("Enter your salary");
        double salary = s1.nextDouble();
        System.out.println("Your salary is " + salary);


    }
}
