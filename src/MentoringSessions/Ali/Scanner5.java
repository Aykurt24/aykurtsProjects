package MentoringSessions.Ali;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {

        //How to write in string, int, double
        //boolean -> true and false

        // Task1:
        // create one boolean and do you want an insurance and print the boolean

        Scanner s1 = new Scanner(System.in);
        System.out.println("Do you want an insurance ");
        boolean insurance = s1.nextBoolean();
        System.out.println("Do you want an insurance: " + insurance);

        // Task2: create boolean do you want a two way ticket?

        System.out.println("Do you want a two way ticket? ");
        boolean twoWay = s1.nextBoolean();
        System.out.println("Answer for the two way question: " + twoWay);
        System.out.println();

    }
}
