package JavaTechnoStudy.day43.extendsKeyword.ex3;

public class Employee {
    public double salary;
    public double coef; //epi
    private String name;

    public Employee(String name, double salary, double coef) {
        this.name = name;
        this.salary = salary;
        this.coef = coef;
    }

    public double calculateSalary() {
        return this.salary * this.coef;
    }

    @Override
    public String toString() {
        return this.name + ": $" + this.calculateSalary();
    }
}
