package JavaTechnoStudy.day4;

public class Ex1 {

    public static void main(String[] args) {

        //int integerNumber = 100;
        //byte byteNumber = (byte) integerNumber;

        int ten = 10;
        int three = 3;

        double result = (double) ten / three;
//        System.out.println(result);
//        System.out.println(result);

        System.out.println(10 / 3); // result only int : 3
        System.out.println(10.0 / 3); // result decimal 3.333
        System.out.println(10 / 3.0);   // result decimal 3.333
        System.out.println(10.0 / 3.0);  // result decimal 3.333

        System.out.println();

        String text = "Weather is ";
        int degree = 22;
        char f = 'C';

        System.out.println(text + degree + f);


    }
}
