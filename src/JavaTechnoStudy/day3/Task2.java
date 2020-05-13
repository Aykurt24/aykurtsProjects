package JavaTechnoStudy.day3;

public class Task2 {

    /* Task
     * create 3 decimal variable and print them
     */

    public static void main(String[] args) {

        double water = 5, bread = 2, meat = 15;

        System.out.println(water);
        System.out.println(bread);
        System.out.println(meat);

        System.out.println("==========================");

        // create 6 variable with different
        // dataType with meaningful names;
        byte age = 100;
        short letters = 26;
        int attendees = 151;
        long salary = 133_000;
        float pi = 3.14F;
        double gravityOfEarth = 9.8;

        System.out.println("age: " + age + "\nletters: " + letters
                + "\nattendees: " + attendees
                + "\nsalary: " + salary + "\npi: " + pi
                + "\ngravityOfEarth: " + gravityOfEarth);


    }
}

