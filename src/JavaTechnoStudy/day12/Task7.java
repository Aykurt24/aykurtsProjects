package JavaTechnoStudy.day12;

import java.util.Random;
import java.util.Scanner;

public class Task7 {

    /*
    Write a Java program to evaluate exam result of student
    constraints: use string as input
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
     */

    public static void main(String[] args) {
        //with scanner
        Scanner scan = new Scanner(System.in);

        //with random     01234
        String results = "ABCDF#";
        Random rand = new Random();
        char letter = results.charAt(rand.nextInt(6));

        System.out.print("Provide exam result of student[A, B, C, D, F]: ");
        String examResult = letter + ""; //String.valueOf(  ); Character.toString(  );
        System.out.println(examResult);

        if (examResult.equals("A")) {
            System.out.println("Excellent!!!");
        } else if (examResult.equals("B")) {
            System.out.println("Well done");
        } else if (examResult.equals("C")) {
            System.out.println("Good");
        } else if (examResult.equals("D")) {
            System.out.println("Need improvement");
        } else if (examResult.equals("F")) {
            System.out.println("Fail");
        } else {
            System.out.println("Not valid input!!!");
        }

        System.out.println("<<<<<<< Second way >>>>>>>>");

        String str = "ABCDF";
        //01234
        Random random = new Random();
        int randomIndex = random.nextInt(5);

        String exResult = "" + str.charAt(randomIndex);  //String.valueOf( str.charAt(randomIndex) ); //Character.toString(str.charAt(randomIndex));

        System.out.println("Exam result: " + exResult);

        if (exResult.equals("A")) {
            System.out.println("Excellent!!!");
        } else if (exResult.equals("B")) {
            System.out.println("Well done");
        } else if (exResult.equals("C")) {
            System.out.println("Good");
        } else if (exResult.equals("D")) {
            System.out.println("Need improvement");
        } else if (exResult.equals("F")) {
            System.out.println("Fail");
        }
    }
}
