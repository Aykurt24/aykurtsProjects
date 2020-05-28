package moreAboutJava.reversing;

import java.util.Arrays;
import java.util.Collections;

public class ReversingIntArray {

    // 1.Way
    /*function reverses the elements of the array*/
    static void reverse(Integer number[]) {
        Collections.reverse(Arrays.asList(number));
        System.out.println(Arrays.asList(number));
    }

    // 2.Way
    public static void printReverseArray(double[] array) {
        System.out.print("Reversed Array ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

    }


    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50};
        reverse(arr);
        double[] array = {2.5, 3.4, 1.2, 3.3};
        Arrays.sort(array);
        System.out.println("Sorted Array " + Arrays.toString(array));
        printReverseArray(array);


    }




}



