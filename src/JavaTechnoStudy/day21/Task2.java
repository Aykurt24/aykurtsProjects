package JavaTechnoStudy.day21;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    // create a method that will fill arrayList of integers with random numbers

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        RandomNumber(list);
//        Random random = new Random();
//
//        list.add(random.nextInt(5));
//        list.add(random.nextInt(5));
//        list.add(random.nextInt(5));
//        list.add(random.nextInt(5));
//
//        System.out.println(list);
    }

    public static void RandomNumber(ArrayList<Integer> numbers) {

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            numbers.add(random.nextInt(5)); // 0 to 5 but 5 is exclusive
        }
        System.out.println(numbers);

    }

}

