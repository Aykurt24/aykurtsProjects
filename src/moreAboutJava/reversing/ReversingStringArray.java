package moreAboutJava.reversing;

import java.util.Arrays;
import java.util.Collections;

public class ReversingStringArray {

    public static void reverse(String[] array) {
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }

    public static void main(String[] args) {
        String[] array = {"ali", "Veli", "4950"};
        reverse(array);

    }
}
