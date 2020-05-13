package JavaTechnoStudy.day12;

import java.util.Scanner;

public class Task9 {


    public static class Q139 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int z = scan.nextInt();
            if (z == 1) printSunset();
            if (z == 2) printEarth();
            if (z == 3) printDesert();

        }

        private static void printDesert() {
        }

        private static void printEarth() {
        }

        public static void printSunset() {
            System.out.print("_\\/_                 |                _\\/_\r\n" +
                    "/o\\\\             \\       /            //o\\\r\n" +
                    " |                 .---.                |\r\n" +
                    "_|_______     --  /     \\  --     ______|__\r\n" +
                    "1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n");
        }//end print_sunset
    }
}

