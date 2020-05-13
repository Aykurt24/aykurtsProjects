package JavaTechnoStudy.day8;

public class Task7 {

    /* Write a Java program to break an integer into a sequence of individual digits.
        ex: input: 12345
        output: 1
            2
            3
            4
            5
     */

    public static void main(String[] args) {

        // 1. Way
        String input = "12345";
        for (int i = 0; i < input.length(); i++)
            System.out.print(input.charAt(i) + "\n");

        System.out.println("==================");

        // 2. Way
        String input2 = 12345 + "";
        for (int i = 0; i < input2.length(); i++)
            System.out.println(input2.charAt(i));

        System.out.println("==================");

        // 3. Way
        int input3 = 12345;
        String str = String.valueOf(input3);
        for (int i = 0; i < str.length(); i++)
            System.out.print(str.charAt(i) + "\n");

        System.out.println("==================");

        // 4. Way
        int n = 12345;

        System.out.println(n / 10000);          // 12345 / 10000 = 1
        System.out.println((n / 1000) % 10);  // (12345 / 1000) % 10 = (12) % 10 = 2
        System.out.println((n / 100) % 10);   // (12345 / 100) % 10 = (123) % 10 = 3
        System.out.println((n / 10) % 10);    // (12345 / 10) % 10 = (1234 % 10 = 4
        System.out.println(n % 10);           // 12345 % 10 = 5

    }
}
