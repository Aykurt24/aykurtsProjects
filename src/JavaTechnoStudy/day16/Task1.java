package JavaTechnoStudy.day16;

public class Task1 {
    // Write a Java program to sum values of an array
    // constraints: size should be 5

    public static void main(String[] args) {
        int[] numbers = {30, 45, 15, 10, 22};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum is: " + sum);

    }
}