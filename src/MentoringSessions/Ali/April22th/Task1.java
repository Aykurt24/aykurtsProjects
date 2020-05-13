package MentoringSessions.Ali.April22th;

import java.util.HashSet;

public class Task1 {

/*
       In the main method

       Create one HashSet Double

       add 3.23 , 3.10 , 5.12 , 10.12 , 23.12

       sum all the numbers and print them

            result should be 44.69

     */

    public static void main(String[] args) {

        HashSet<Double> numbers = new HashSet<>();
        numbers.add(3.23);
        numbers.add(3.10);
        numbers.add(5.12);
        numbers.add(10.12);
        numbers.add(23.12);

        double total = 0;

        for (Double d1 : numbers) {
            total += d1; //total = total + d1;

        }
        System.out.println(total);
    }
}
