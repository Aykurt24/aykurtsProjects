package saturdayProject1;

import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line
        int a = word.length();

        if (a % 2 == 1) {
            System.out.println(true);

        } else System.out.println(false);
    }
}

/*      int countLetter = word.length();
        boolean odd = countLetter % 2 != 0;

        if (odd == true) {
            System.out.println(odd);
        }else {
            System.out.println("false");
        }
 */

/*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line

        int textLength =  word.length();
        //System.out.println(textLength);

      if (textLength % 2 == 0) {
          System.out.println(false);
      } else {
          System.out.println(true);
      }
    }
}

 */