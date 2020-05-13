package saturdayProject1;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.parseInt(scanner.nextLine());

        //  code Start here don't change before this line
        Random rand = new Random();
        int generate = rand.nextInt(max + 1);
        System.out.println(generate);
    }
}


//        RandomNum obj1 = new RandomNum();       // creating an object of RandomNum
//        int random = obj1.randomWithRange(0, max); // range is from 0 to max
//        System.out.println(random);
//
//    }
//
//    // outside of main method
//
//    int randomWithRange(int min, int max) {
//        int range = (max - min) + 1;
//        return (int) (Math.random() * range) + min;
//
//    }
//}

/* dogan's   int number = (int) (Math.random()*(max+1));
            System.out.println(number);
 */


/* amal's public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.parseInt(scanner.nextLine());

        //  code Start here don't change before this line

        Random rand = new Random();
        int generate = rand.nextInt(max);
        System.out.println(generate);
    }
}
 */