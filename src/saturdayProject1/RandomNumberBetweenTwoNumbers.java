package saturdayProject1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        //  code Start here don't change before this line

        Random random = new Random();
        int randomInt = random.nextInt(max + 1 - min) + min;

        System.out.println(randomInt);
    }
}



        /* Second way

        RandomNumberBetweenTwoNumbers obj1 = new RandomNumberBetweenTwoNumbers();
        // creating an object of RandomNumberBetweenTwoNumbers

        int random = obj1.randomWithRange(min, max); // range is from min to max
        System.out.println(random);

    }

    // outside of main method
    int randomWithRange(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }
}
         */