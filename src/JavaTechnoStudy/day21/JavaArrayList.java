package JavaTechnoStudy.day21;

import java.util.ArrayList;

public class JavaArrayList {

    // ArrayList
    // Set
    // Map

    public static void main(String[] args) {
        // declaring arrayLists
        ArrayList<Integer> integerArrayList;
        ArrayList<String> stringArrayList;
        ArrayList<Boolean> booleanArrayList;

        // initialize String,Integer,Boolean ArrayList
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Boolean> statement = new ArrayList<>();

        // adding elements to arrayList
        names.add("Jon");
        names.add("Aria");
        names.add("Maruf");

        numbers.add(5); // index 0
        numbers.add(3); // index 1

        statement.add(true);

        // adding element at specific position
        names.add(1, "Ali");

        numbers.add(0, 10);


        // to get element from arrayList
        String elementAtIndex2 = names.get(2);

        Integer elementAtIndex1 = numbers.get(1);
        //System.out.println(elementAtIndex1);
        System.out.println(numbers.get(0));


        // to update/change/set element at specific position
        names.set(0, "Bulut");

        numbers.set(0, 23);

        // to get size/length of arrayList
        int sizeOfArrayList = names.size();

        int sizeOfArrayListOfInteger = numbers.size();

        // check if arrayList is empty
        boolean empty = names.isEmpty();
        boolean emptyNumber = numbers.isEmpty();

        // to remove element
        boolean remove = names.remove("Aria");

        Integer romoveNumbers = numbers.remove(0);

        // to remove element at specific position
        names.remove(0);

        numbers.remove(1);

        //print without any extra method

        System.out.println(names);

        System.out.println(numbers);

        // to remove everything from arrayList
        names.clear();
        numbers.clear();
    }
}