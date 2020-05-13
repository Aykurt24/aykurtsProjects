package JavaTechnoStudy.day13;

import java.util.Scanner;

public class Task2 {
    // write a java program which read text from user
    // and prints it 5 times

    //input:     text:   Hi
    //output:    result: HiHiHiHiHi

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter text: ");
        String text = read.nextLine();

        String result = ""; // this is for part 2

        int i = 0;
        while (i < 5) {
            System.out.print(text);

            ++i;

            //part2: print "its too long" if the length of result is greater than 5


            result += text;
            System.out.println(i + "." + result);
            i++;
        }

        System.out.println("Final result: " + result);
    }

}