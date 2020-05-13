package MentoringSessions.Tuba.April14th;

import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

        // find the duplicate elements

        int[] arr = {1, 1, 2, 3, 4, 2, 5};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " is a duplicate element");
            }

            //Second solution:
            // find the duplicate elements

            int[] array = {1, 1, 2, 3, 4, 2, 5};

            for (int k = 0; k < array.length; k++) {
                for (int j = k; j < array.length; j++) {
                    if (array[k] == array[j] && k != j) {
                        System.out.println(arr[i] + " is myArray duplicate element");
                    }
                }
            }
        }
    }
}