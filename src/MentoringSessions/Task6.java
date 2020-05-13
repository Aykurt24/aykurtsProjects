package MentoringSessions;

import java.util.Scanner;

public class Task6 {
    // Password Strength checker
    // The password must contain any of these characters "* \ . , $"
    // Tell the user to set the length to 8 characters if it's fewer
    // Length == 8

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a password to check it's strength: ");
        String pw = input.nextLine();

        if ((pw.contains("*") || pw.contains("\\") ||
                pw.contains(",") || pw.contains("$"))
                && pw.length() == 8) {
            System.out.println("Your password seems strong!");
        } else {
            System.out.println("You need a stronger password");
        }
    }
}


