package JavaTechnoStudy.day12;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    /*
    Write a Java program to input mark of subject Physics
    calculate grade according to given conditions:

    If percentage >= 90% : Grade A
    If percentage >= 80% : Grade B
    If percentage >= 70% : Grade C
    If percentage >= 60% : Grade D
    If percentage >= 40% : Grade E
    If percentage < 40% : Grade F

    //input:
    //     Physics: 90,
    // output
    Grade A
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Physics: ");
        double physics = input.nextDouble();


        String grade = "Grade ";
        if (physics >= 90) {
            grade = grade + "A";
        } else if (physics >= 80) {
            grade = grade + "B";
        } else if (physics >= 70) {
            grade += "C";
        } else if (physics >= 60) {
            grade += "D";
        } else if (physics >= 40) {
            grade += "E";
        } else if (physics < 40) {
            grade += "F";
        }
        System.out.println(grade);

        System.out.println("///////////////////////////");

        // 2. way solution
        Random random = new Random();
        int percentage = 90;//random.nextInt( 101 );

        System.out.println("Provide a Physics percentage: " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else if (percentage < 40) {
            System.out.println("Grade F");
        }


    }
}