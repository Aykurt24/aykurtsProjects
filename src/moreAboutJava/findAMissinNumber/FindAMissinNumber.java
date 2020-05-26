package moreAboutJava.findAMissinNumber;

import java.util.Arrays;
import java.util.Random;

public class FindAMissinNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[9];
        int missing = 0;
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            missing = (numbers.length + 1) * (numbers.length + 2) / 2 - (sum);
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(missing);
    }

}

