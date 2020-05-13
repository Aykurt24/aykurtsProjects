package JavaTechnoStudy.day11;

public class JavaTernary {
    public static void main(String[] args) {
        int fine;
        int speed = 70;

//        if(speed > 25) {
//            fine = 5;
//        } else {
//            fine = 0;
//        }
//        System.out.println( "Fine is: " + fine );

        fine = speed > 25 ? 5 : 0;
        System.out.println(":? Fine is: " + fine);

    }
}

