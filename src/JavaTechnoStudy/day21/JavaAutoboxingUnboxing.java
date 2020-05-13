package JavaTechnoStudy.day21;

import java.util.ArrayList;

public class JavaAutoboxingUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(1);
        Integer integer1 = new Integer(5);
        numbers.add(integer1);

        //Automatic conversion of primitive types to the object of their
        // corresponding wrapper classes is known as autoboxing.
        // converting primitive to reference type(wrapper class)
        int i = 5;
        numbers.add(i);

        Integer integer = numbers.get(0);
        // Unboxing: It is just the reverse process of autoboxing.
        // Automatically converting an object of a wrapper class to its corresponding
        // primitive type is known as unboxing.
        // converting reference type to primitive(wrapper class)

        // unboxing: get elemets from reference and put into primitive
        int j = numbers.get(0);
    }
}