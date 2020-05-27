package JavaTechnoStudy.day43.tasks.task2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.length;
    }

    public double getPerimeter() {
        return this.length + this.width;
    }

    @Override
    public String toString() {
        return "Rectangle : " +
                " Width = " + width +
                " Length = " + length + " Area = " + getArea() +
                " Perimeter = " + getPerimeter();
    }
}
