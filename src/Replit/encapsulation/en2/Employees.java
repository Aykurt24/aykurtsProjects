package Replit.encapsulation.en2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public static int ageCalculator(String dob) {

        LocalDate current = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
        int year = dateOfBirth.getYear();
        int currentYear = current.getYear();
        int age = currentYear - year;

        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {

        if (ageCalculator(dob) > 18) {
            System.out.println("Welcome to our company " + name + " your salary is " + salary + ".");
        }
        if (ageCalculator(dob) == 18) {
            System.out.println("we can have inter with you after that you can have a " + salary + " salary");
        }
        if (ageCalculator(dob) < 18) {
            System.out.println("come back when you are 18 years old.");

        }

        this.dob = dob;
    }

    public String toString() {
        return "";
    }
}
