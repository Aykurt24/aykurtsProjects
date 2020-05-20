package JavaTechnoStudy.day33.javaRecursion;

public class Ex1 {

    //method to print from 1 to 5;
    static void print1to5() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    static int printito5(int i) {
        System.out.println(i);
        if (i == 5) {
            return -1;
        }

        return printito5(i + 1);
    }


    public static void main(String[] args) {
//        print1to5();
        printito5(4);
        System.out.println("===================");
        print1to5();
    }
}
