package JavaTechnoStudy.day22;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<Double> doubles = generateList();

        System.out.println(doubles);

        Double secondElement = retrieveElement(doubles, 1);
        System.out.println("Second Element in the list : " + secondElement);

        updateElement(doubles, 1, 100.0);

        System.out.println("After updating : " + doubles);

        removeThirdElement(doubles);

        System.out.println("After removing third element from the list : " + doubles);
    }

    // create a method that will generate arrayList of double with random double values
    public static ArrayList<Double> generateList() {
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Math.random() * 100);
        }

        return list;
    }

    // create a method to retrieve an element at specified index from given arrayList
    public static Double retrieveElement(ArrayList<Double> list, int position) {
        return list.get(position);
    }

    // create a method to update element in specified position
    public static void updateElement(ArrayList<Double> list, int position, Double value) {
        list.set(position, value);
    }

    // create a method to remove the third element from a arrayList
    public static void removeThirdElement(ArrayList<Double> list) {
        list.remove(2);
    }
}