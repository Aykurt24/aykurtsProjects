package moreAboutJava.reversing;

import java.util.Arrays;
import java.util.Collections;

public class BiggerToSmaller {

    public static void main(String[] args) {
        //to sort array
        System.out.println("\nto sort array");
        int[] numbers1 = {4, 1, 9, 5, 3};
        System.out.println("before sort: " + Arrays.toString(numbers1));
        // Arrays.sort(numbers1);
        // System.out.println("after sort: " + Arrays.toString(numbers1));
        char[] letters = {'z', 'b', 'f', 'a'};
        System.out.println("before sort: " + Arrays.toString(letters));
        Arrays.sort(letters);
        System.out.println("after sort: " + Arrays.toString(letters));
        Arrays.sort(numbers1, 0, 5);
        System.out.println(Arrays.toString(numbers1));
        Integer[] numbers5 = {4, 1, 9, 5, 3};
        Arrays.sort(numbers5);
        Collections.reverse(Arrays.asList(numbers5));
        System.out.println(Arrays.asList(numbers5));
    }


}
