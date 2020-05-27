package JavaTechnoStudy.day43.tasks.task2;

public class Circle extends Shape {
    private double radius;
    final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * pi;
    }

    public double getPerimeter() {
        return 2 * this.radius * pi;
    }

    @Override
    public String toString() {
        return "Circle :" +
                " Radius = " + radius + " Area = " + getArea() +
                " Perimeter = " + getPerimeter();
    }
}