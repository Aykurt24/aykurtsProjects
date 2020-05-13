package JavaTechnoStudy.day13;

import java.util.Scanner;

public class Task5 {
    // write program which checks if provide hacking code is correct
    // use do-while

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hackCode;

        String tool = "email";
        do {
            System.out.println("Write hacking code: ");
            hackCode = input.nextInt();
        } while ((hackCode == 9999 || hackCode == 5555) && tool.equals("network"));

        System.out.println("Failed to hack");

        System.out.println("===========================");

        System.out.println("Welcome to hacking tutorial!!!");
        String hacks;
        do {
            hacks = input.nextLine();
            System.out.println("Breaching the network...");
        } while (hacks.length() < 10);

        System.out.println("Hacking is over, police get you");
    }

}