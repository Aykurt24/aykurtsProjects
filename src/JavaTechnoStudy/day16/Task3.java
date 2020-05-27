package JavaTechnoStudy.day16;

import java.util.Arrays;

public class Task3 {

    // create array of fruits and print them using for-each loop
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Cherry", "Kiwi", "peach",
                "orange", "pineapple", "grapes", "mango",
                "banana", "strawberry", "melon"};

        System.out.println(Arrays.toString(fruits));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

}
