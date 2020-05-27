package mentoringSessions.Ali;

import java.util.Scanner;

public class Scanner1 {
    // String   -> texts
    // byte     -> whole numbers
    // short    -> whole numbers
    // int      -> whole numbers
    // long     -> whole numbers
    // boolean  -> true false
    // double   -> decimal numbers
    // float    -> decimal numbers
    // char     -> character

    /* Scanner is a class for getting the input of the primitive types like int, boolean
        and also String... It is the easiest way to read input in the Java programming.
     */

    String username = "Bulut";
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //system in is an InputStream which is typically connected to keyboard

        String username = scanner.nextLine();

        System.out.println("your name is " + username);

        String lastName = scanner.nextLine();

        System.out.println("your last name is " + lastName);


    }
}
