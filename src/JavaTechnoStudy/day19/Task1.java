package JavaTechnoStudy.day19;

import java.util.Arrays;

public class Task1 {
    // create a method that prints maximum number in given array

    // part 2. create a method that prints minimum number in given array

    // part 3. create a method that prints even numbers in given array

    public static void main(String[] args) {
//                         1  2  3   4  5  6  7  8  9 // length
//                         0  1  2   3  4  5  6  7  8 // index
        int[] numbers = {6, 7, 4, 99, 1, 2, 5, 4, 3};
        printMax(numbers);
        printMin(numbers);
        printEvenNumbers(numbers);
        printDecreasingOrder(numbers);

    }

    // method that prints maximum number in given array
    public static void printMax(int[] array) {
        Arrays.sort(array);
        System.out.println("Max is: " + array[array.length - 1]);
    }

    // method that prints minimum number in given array
    public static void printMin(int[] array) {
        Arrays.sort(array);
        System.out.println("Min is: " + array[0]);
    }

    // method that prints even numbers in given array
    public static void printEvenNumbers(int[] array) {
        System.out.print("Even Numbers: ");
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public static void printDecreasingOrder(int[] array) {
        System.out.print("Decreasing Order: ");
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}