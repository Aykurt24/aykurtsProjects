package JavaTechnoStudy.day12;

public class JavaIfElseIfLadderStatement {
    public static void main(String[] args) {
        // if-else-if ladder statement

        int age = 10;

        if (age == 10) { // 20 == 10 false   // N == 10
            System.out.println("Age is greater than 10");

        } else if (age > 15) { // 20 > 15 true  // N > 15
            System.out.println("Age is greater than 15");

        } else if (age < 5) { // 15 < 5 false  // N < 5
            System.out.println("Age is smaller than 5");

        } else { // 5 <= N && N <= 15 && N ! = 10
            System.out.println("it is between 5 and 15");
        }
    }
}
