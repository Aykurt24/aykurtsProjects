package JavaTechnoStudy.day13;

public class JavaWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        while (i < 5) { // 5 < 5 = false
            System.out.println("Hi: " + i);
            ++i;

        }

        System.out.println("after the loop value of i:" + i);

        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;");

        int counter = 0;

        while (counter < 5) {
            System.out.println("Hello: " + counter);
            counter++;
        }

        System.out.println("End of the code");
    }

}