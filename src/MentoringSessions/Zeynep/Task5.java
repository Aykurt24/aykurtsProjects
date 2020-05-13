package MentoringSessions.Zeynep;

public class Task5 {
    //Print elements that are greater than average

    public static void main(String[] args) {
        int[] numbers = {30, 40, 100, 155, 23, 136};

        int total = 0;
        double average = 0;

        for (int number : numbers) {

            total += number;

            average = total / numbers.length;
        }
        System.out.println("average " + average);
        for (int number : numbers) {

            if (number > average) {
                System.out.println(number);
            }
        }
    }
}
