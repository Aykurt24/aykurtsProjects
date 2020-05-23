package JavaTechnoStudy.day37.examples;

import java.util.Scanner;

public class JavaRunTimeEx1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Provide first number: ");
        int a = scan.nextInt();

        System.out.print("Provide second number: ");
        int b = scan.nextInt();

        //unchecked(unexpected) exception will be thrown here(Arithmetic exception)
        //we cant predict it before we execute/do that
        try {
            System.out.println("a/b = " + (a / b));
        } catch (Exception e) {
            System.out.println("Look your numbers");
            System.out.println(e);
        }
        ///java.util.InputMismatchException
    }
}