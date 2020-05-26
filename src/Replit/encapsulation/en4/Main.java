package Replit.encapsulation.en4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String brand = scan.nextLine();
        String manufacturedYear = scan.nextLine();
        int doorCount = scan.nextInt();

//  DONT CHANGE THE CODE BEFORE THIS LINE AND USE THESE VARIABLES WHILE SETTING THE SETTER IN CarWebSite CLASS

        CarWebSite car1 = new CarWebSite();
        car1.setBrandOfCar(brand);
        car1.setDoorCount(doorCount);
        car1.setManufacturedYear(manufacturedYear);

        System.out.println(car1);


    }
}
