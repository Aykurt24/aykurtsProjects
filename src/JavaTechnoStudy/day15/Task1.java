package JavaTechnoStudy.day15;

public class Task1 {
    // print grid of "#" with 10 rows and 10 columns
    // using nested loop
    /*
    ##########
    ##########
    ##########
    ##########
    ##########
    ##########
    ##########
    ##########
    ##########
    ##########
     */
    public static void main(String[] args) {

        for (int outer = 0; outer < 10; outer++) {

            for (int inner = 0; inner < 10; inner++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

//        second way
//        for (int i = 0; i <10 ; i++) {
//        for (int j = 0; j <10 ; j++) {
//        System.out.print("#");
//        }
//        System.out.println();
//        }
