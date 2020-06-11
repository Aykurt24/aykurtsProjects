package Replit.Abstract.abstract3;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Phone {

    static ArrayList<String> cart = new ArrayList<>();

    public int getSum(String str) {

        str = str.replaceAll("[^\\d.]", "");
        int number = Integer.parseInt(str);

        return Integer.parseInt(str);
    }

    abstract String options(String option1, String option2);


}

class Apple extends Phone {


    @Override
    String options(String option1, String option2) {


        if (option1.equalsIgnoreCase("64 GB") && option2.equalsIgnoreCase("5.5 inch")) {
            cart.add("$750");
        } else if (option1.equalsIgnoreCase("64 GB") && option2.equalsIgnoreCase("6.5 inch")) {
            cart.add("$850");
        } else if (option1.equalsIgnoreCase("128 GB") && option2.equalsIgnoreCase("5.5 inch")) {
            cart.add("$950");
        } else if (option1.equalsIgnoreCase("128 GB") && option2.equalsIgnoreCase("6.5 inch")) {
            cart.add("$1200");
        }

        return cart.get(0);
    }
}

class Samsung extends Phone {


    @Override
    String options(String option1, String option2) {


        if (option1.equalsIgnoreCase("256 GB") && option2.equalsIgnoreCase("5.5 inch")) {
            cart.add("$1000");
            return "$1000";
        } else if (option1.equalsIgnoreCase("256 GB") && option2.equalsIgnoreCase("7.5 inch")) {
            cart.add("$1200");
            return "$1200";
        } else if (option1.equalsIgnoreCase("512 GB") && option2.equalsIgnoreCase("5.5 inch")) {
            cart.add("$1300");
            return "$1300";
        } else if (option1.equalsIgnoreCase("512 GB") && option2.equalsIgnoreCase("6.5 inch")) {
            cart.add("$1400");
            return "$1400";
        }

        return "";
    }
}


class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();
        String str4 = input.nextLine();

        Apple apple = new Apple();
        apple.getSum(apple.options(str1, str2));
        Samsung samsung = new Samsung();
        System.out.println(samsung.getSum(samsung.options(str3, str4)) + apple.getSum(apple.options(str1, str2)));

    }
}
