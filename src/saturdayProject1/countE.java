package saturdayProject1;

import java.util.Scanner;

public class countE {

/*    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0


     input: bucket
            b:1
        output should be 1
        */


    //hint: .charAt, length(), for, index, counter,

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

//      code start here
        int b = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'b') {
                b++;
            }
            System.out.println(+b);
        }
    }
}
