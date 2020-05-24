package JavaTechnoStudy.day42.Tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(4);
        numbers.add(6);


        MyNumber myNumber = new MyNumber(numbers);
        System.out.println(myNumber);

        List<Integer> evenNumbers = myNumber.getEvenNumbers();
        System.out.println("copy of evenNumbers: " + evenNumbers);
        evenNumbers.add(100);

        System.out.println("copy of evenNumbers after update: " + evenNumbers);
        System.out.println(myNumber);
    }
}
