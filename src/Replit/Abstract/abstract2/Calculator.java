package Replit.Abstract.abstract2;

import java.util.Scanner;

abstract class Calculator {

    abstract int calculating(int number1, int number2);


}

class Sum extends Calculator {

    @Override
    int calculating(int number1, int number2) {
        System.out.println(number1 + number2);
        return number1 + number2;
    }
}

class Divide extends Calculator {

    @Override
    int calculating(int number1, int number2) {
        System.out.println(number1 / number2);
        return number1 / number2;
    }
}

class Multiply extends Calculator {

    @Override
    int calculating(int number1, int number2) {
        System.out.println(number1 * number2);
        return number1 * number2;
    }
}

class Substract extends Calculator {

    @Override
    int calculating(int number1, int number2) {
        System.out.println(number1 - number2);
        return number1 - number2;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        int num1 = dp.nextInt();

        int num2 = dp.nextInt();

        Sum sum = new Sum();
        sum.calculating(num1, num2);
        Divide divide = new Divide();
        divide.calculating(num1, num2);
        Multiply multiply = new Multiply();
        multiply.calculating(num1, num2);
        Substract substract = new Substract();
        substract.calculating(num1, num2);


    }

}