package mentoringSessions.Ali;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Scanner lets us to type in the console

        // Task1: Create one String and store the email and print your email
        System.out.println("Enter your email ");
        String email = scanner.nextLine();
        System.out.println("Your email is " + email);

        // Task2: Create ont int and store the total count of your family members and print them
        System.out.println("Enter your family members count");
        int totalMember = scanner.nextInt();
        System.out.println("Your total member is " + totalMember);

        // Task3: Create one String and store the name of your player and print them
        System.out.println("Enter your player name");
        scanner.nextLine();
        String playerName = scanner.nextLine();
        System.out.println("Your player name is " + playerName);


    }
}

