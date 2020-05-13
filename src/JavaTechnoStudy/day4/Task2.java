package JavaTechnoStudy.day4;

public class Task2 {
    // create two variables, with data type int & float
    // part1: convert float variable to int variable

    public static void main(String[] args) {

//        int number;
//        float decimal;
//
//        decimal = 1.9F;
//        number = (int) decimal;

//        float decimal = 1.9F;
//        int number = (int) decimal;

//        System.out.println( decimal );
//        System.out.println( number );

//        int integer1 = 288888;
//        float float1 = (float) integer1;
//        System.out.println( integer1 );
//        System.out.println( float1 );

        // Part 2
        // create 2 variables, double and short
        // convert double to short

        double decimal = 1.7;
        short shortNumber = (short) decimal;

        System.out.println(decimal);
        System.out.println(shortNumber);

        // Part3:
        // create two variables, long and int
        // with value for long as: 2_147_483_648
        // convert long to int

//        long bigNumber = 2_147_483_648L;
//        int num = (int) bigNumber;
//        System.out.println(bigNumber);
//        System.out.println(num);

        // Part3:
        // create two variables, short and byte
        // with value for short as: 128
        // convert short to byte

        short a = 128;
        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        System.out.println((byte) 126);
        System.out.println((byte) 127);
        System.out.println((byte) 128); // because range of byte is between -128 and 127
        System.out.println((byte) -129);


        // Part1:
        // create two variables, double and short
        // covert double to short

//       double decimal = 1.7;
//       short shortNumber = (short) decimal;
//       System.out.println(decimal);
//       System.out.println(shortNumber);

        // Part2:
        // create two variables, long and int
        // with value for long as: 2_147_483_648
        // convert long to int

//        part 2 ; -2_147_483_648 < integer < 2_147_483_647;
//        long bigNumber = 2_147_483_648L;
//        int num = (int) bigNumber;
//        System.out.println(bigNumber);
//        System.out.println(num);


        // Part3:
        // create two variables, short and byte
        // with value for short as: 128
        // convert short to byte

//        short num = 128; // 127+1
//        byte byteValue = (byte) num;
//
//        System.out.println(num);
//        System.out.println(byteValue);

//        System.out.println((byte) 126);
//        System.out.println((byte) 127);
        System.out.println((byte) 129);
        // because range of byte is
        // between -128 and +127

//        System.out.println((byte) -129);

    }
}