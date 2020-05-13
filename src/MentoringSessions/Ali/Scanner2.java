package MentoringSessions.Ali;

import java.util.Scanner;

public class Scanner2 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String address = input.nextLine();
        System.out.println("Your address is " + address);

        // Task1: Create one string and use scanner to type in the console
        // city -> String name

        String city = input.nextLine();
        System.out.println("Your current city is " + city);

        // Task2: how to store in the int -> nextInt()
        int zipCode = input.nextInt();
        System.out.println("Your zip code is " + zipCode);

        //Task3: please create one age integer
        //       enter age, and print age
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        // Task4: Please create one String
        //        Enter the country
        //        Print the country
        input.nextLine(); // sometime scanner does read the "nextLine",
        // that's why we need to add this code.
        String country = input.nextLine();
        System.out.println("my country is " + country);

        /* we are using nextline to store in the String
            we are using
         */

    }

}
