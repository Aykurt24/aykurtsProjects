package JavaTechnoStudy.day12;

import java.util.Random;
import java.util.Scanner;

public class JavaSwitchStatement {

    //switch

    public static void main(String[] args) {
        Random random = new Random();
        int day = 1 + random.nextInt(7); //0 - 7
//        int day = 1;
        System.out.println("You day is: " + day);

        switch (day) {
            case 1: // if day == 1
                System.out.println("Monday");
                break;
            case 2:// if day == 2
                System.out.println("Tuesday");
                break;
            case 3:// if day == 3
                System.out.println("Wednesday");
                break;
            default:// else
                System.out.println("not a valid day number");
                break;
        }

        // Evening class note
        Scanner scan = new Scanner(System.in);
        System.out.print("Provide exam result of student[A, B, C, D, F]: ");
        String examResult = scan.nextLine();

        String examMark = "";
        switch (examResult) {
            case "A":
                examMark = "Excellent!!!";
                break;
            case "B":
                examMark = "Well done";
                break;
            case "C":
                examMark = "Good";
                break;
            case "D":
                examMark = "Need improvement";
                break;
            case "F":
                examMark = "Fail";
                break;
            default:
                examMark = "Not a valid input";
                break;
        }
        System.out.println(examMark);


    }

}
