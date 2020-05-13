package JavaTechnoStudy.day13;

import java.util.Scanner;

public class WhileLoopEx3 {

    // write a program to check pin code
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Provide a pin code: ");
        int userPin = input.nextInt();

        int pinCode = 5555;

        /*
        if(userPin == pinCode) {
            System.out.println( "Entered successfully" );
        } else {
            System.out.println( "incorrect pin" );
        }
         */

        while (userPin != pinCode) {
            System.out.println("Incorrect pin");
            System.out.println("Provide a pin code, again: ");
            userPin = input.nextInt();
        }

        System.out.println("Entered successfully");

        System.out.println("===========================");


        // hocanin anlattigi

        String button = "";

        Scanner input1 = new Scanner(System.in);
        while (!button.equals("x")) {
            System.out.println("Program is running...");

            button = input.nextLine();
        }

        System.out.println("Program is closed!!!");

    }
}