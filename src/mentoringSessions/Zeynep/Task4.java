package mentoringSessions.Zeynep;

public class Task4 {
    //Write a Java program to find the maximum and minimum value of an array.

    public static void main(String[] args) {

        int[] myArray = {3, 4, 5, 6, 2, 3, 18, 1};

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {

            int currentValue = myArray[i];

            if (currentValue > max) {

                max = currentValue;
            }

        }
        System.out.println(max);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            int currentValue = myArray[i];
            if (currentValue < min) {
                min = currentValue;
            }
        }
        System.out.println(min);
    }
}
