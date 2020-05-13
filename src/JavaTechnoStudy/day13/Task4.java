package JavaTechnoStudy.day13;

import java.util.Scanner;

public class Task4 {

    // write a program to check pin code
    // using do while loop
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int userPin;
        int pinCode = 5555;
        boolean firstIteration = false;
        do {
            if (firstIteration) {
                System.out.println("Incorrect pin");
                firstIteration = true;
            }

            System.out.println("Provide a pin code: ");
            userPin = input.nextInt();

        } while (userPin != pinCode);

        System.out.println("Entered successfully");

        System.out.println("=========================");

        // write a program to check pin code
        // run it until user enters correct pin code

        // CORRECT PIN: 9999

        // constraints: user should provide an integer
        //              use do-while loop

//            int userPin1;
//            int correctPin = 9999;
//
//            Scanner input1 = new Scanner( System.in );
//
//            System.out.println( "Welcome to our system!!!" );
//
//            do {
//                System.out.println( "Enter you pin: " );
//                userPin = input.nextInt();
//            } while(userPin != correctPin);
//
//            System.out.println( "Entered to system" );

    }
}