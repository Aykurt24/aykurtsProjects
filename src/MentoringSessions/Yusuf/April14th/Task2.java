package MentoringSessions.Yusuf.April14th;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[][] array = new int[5][4];

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNumber = rand.nextInt(50);
                array[i][j] = randomNumber;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}