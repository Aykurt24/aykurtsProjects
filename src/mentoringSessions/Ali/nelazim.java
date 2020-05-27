package mentoringSessions.Ali;

import java.util.Scanner;

public class nelazim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        // code start here DONT CHANGE THE CODE BEFORE THIS LINE

        if (number % 2 == 0) {
            System.out.println("number is a EVEN number");
        } else if (number % 2 != 0) {
            System.out.println("number is a ODD number");
        }
    }
}
