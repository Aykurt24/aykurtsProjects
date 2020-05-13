package JavaTechnoStudy.day13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Ask user to last a number;
        // calculate sum of numbers between 0 and last number

        // ex:
        // provided number: 2
        // output: 3


        //part2:
        // calculate sum of numbers between 50 and provided number

        Scanner input = new Scanner(System.in);
        System.out.println("Provide a number, please:");

        int lastNumber = input.nextInt();

        int result = 0;
        int i = 0;

        while (i <= lastNumber) { // 4. 3 <= 2
            result += i; // 0 1 2 3 4 ... until lastNumber

            i++;  //increment my iteration number

            //           (result, i)
            // 1. result = 0+0; = 0
            // 2. result = 0+1; = 1
            // 3. result = 0+2; = 3
        }

        System.out.println("sum is: " + result);
//
//        //part 2
//        int result1 = 0;
//        int counter = 50;
//        while(counter <= 100) {
//            System.out.println( "Num:" + counter );
//            result += counter; //result = result + counter;
//            // 1. result= 0 + 50;
//            // 2. result= 50 + 51;
//            counter++;
//        }
//        System.out.println( "Sum from 50-100" + result );
    }
}