package JavaTechnoStudy.day16;

import java.util.Arrays;

public class JavaArrayEx2 {


    public static void main(String[] args) {
        //String array
        //When you don`t know what will be values of array
//        String[] array = new String[3];
        String[] member = new String[5]; // limitation
        String[] names = {"Bob", "Alice", "Trudy"};// no limitation
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
//        numbers[3]= 4;

        int[] ages = {25, 20, 38, 40, 50};


        //class Arrays
        //**Arrays.toString();**
        System.out.println("Prints string array: " + Arrays.toString(names));
        System.out.println("Prints int array: " + Arrays.toString(ages));

    }

}
