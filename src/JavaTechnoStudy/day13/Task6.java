package JavaTechnoStudy.day13;

import java.util.Scanner;

public class Task6 {
    // Write a java program which prints alphabet
    // constraints: lowercase letters
    // abcde... to z

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // iterate a -> z

        char letter = 'a';

        while (letter <= 'z') {
            System.out.print(letter);
            letter++;

        }

    }

}
