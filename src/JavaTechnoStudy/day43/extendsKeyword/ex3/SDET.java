package JavaTechnoStudy.day43.extendsKeyword.ex3;

public class SDET extends Employee {
    private double bonus;

    public SDET(String name, double salary, double coef, double bonus) {
        super(name, salary, coef);
        this.bonus = bonus;
        super.coef = coef;
        super.salary = salary;
    }

//    @Override
//    public double calculateSalary() {
//        return salary * coef + bonus;
//    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
