package JavaTechnoStudy.day12;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    /* Write a Java program to input week day and print day number.
        "Monday" = > 1
        "Tuesday" => 2
    */
    public static void main(String[] args) {
        Random random = new Random();
        int day1 = 1 + random.nextInt(2); //0 - 7
//        int day = 1;
        System.out.println("You day is: " + day1);

        switch (day1) {
            case 1: // if day == 1
                System.out.println("Monday");
                break;
            case 2:// if day == 2
                System.out.println("Tuesday");
                break;
        }

        // other task

        /*
    // Write a Java program to input week day and print day number
    "Monday" = > 1
    "Tuesday" => 2
    "Wednesday" => 3
    "Thursday" => 4
    "Friday" => 5
    "Saturday" => 6
    "Sunday" => 7

    in other input => "not a valid week day"
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter day of the week: ");
        String day = scan.nextLine();
        day = day.toUpperCase();

        String dayNumber = "";
        switch (day) {
            case "MONDAY":
                dayNumber = "1";
                break;
            case "TUESDAY":
                dayNumber = "2";
                break;
            case "WEDNESDAY":
                dayNumber = "3";
                break;
            case "THURSDAY":
                dayNumber = "4";
                break;
            case "FRIDAY":
                dayNumber = "5";
                break;
            case "SATURDAY":
                dayNumber = "6";
                break;
            case "SUNDAY":
                dayNumber = "7";
                break;
            default:
                dayNumber = "Not a valid week day";
                break;
        }

        System.out.println(dayNumber);
    }
}

