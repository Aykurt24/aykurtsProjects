package JavaTechnoStudy.day16;

public class JavaForEachEx1 {

    public static void main(String[] args) {
//        String[] names = new String[5];
//        System.out.println( "names: " + Arrays.toString( names ) );
//
        double[] numbers = new double[3];
        numbers[0] = 1.3;
        numbers[1] = 2.4;

        for (double number : numbers) {
            System.out.println(number);
        }

    }

}

//note: output is 0 cuz the value was not assigned yet.
//we need to create random numbers to assign values