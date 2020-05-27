package moreAboutJava.Reversing;

import java.util.Arrays;
import java.util.Collections;

public class ReversingStringArray {

    public static void reverse(String[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        String[] arr = {"ali", "Veli", "4950"};
        reverse(arr);

    }
}
