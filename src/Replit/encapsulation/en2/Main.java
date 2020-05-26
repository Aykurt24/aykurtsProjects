package Replit.encapsulation.en2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String dop = scan.nextLine();
        int salary = scan.nextInt();


//  DONT CHANGE THE CODE BEFORE THIS LINE AND USE THESE VARIABLES WHILE SETTING THE SETTER IN EMPLOYEES CLASS

        Employees em1 = new Employees();
        em1.setName(name);
        em1.setSalary(salary);
        em1.setDob(dop);

        em1.getName();
        em1.getDob();
        em1.getSalary();

        System.out.println(em1);


    }


}
