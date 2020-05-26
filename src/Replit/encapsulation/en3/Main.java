package Replit.encapsulation.en3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String whichMember = scan.nextLine();
        int memberCount = scan.nextInt();

//  DONT CHANGE THE CODE BEFORE THIS LINE AND USE THESE VARIABLES WHILE SETTING THE SETTER IN EMPLOYEES CLASS

        Subscribe sub = new Subscribe();
        sub.setName(name);
        sub.setMemberCount(memberCount);
        sub.setWhichTypeOfMember(whichMember);
        sub.getPrice();
        System.out.println(sub);
    }

}


