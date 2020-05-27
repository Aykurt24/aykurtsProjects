package JavaTechnoStudy.day43.tasks.task2;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return Math.pow(super.getWidth(), 2);
    }

    public double getPerimeter() {
        return 4 * super.getWidth();
    }

    @Override
    public String toString() {
        return "Square : " +
                " Side = " + getWidth() + " Area = " + getArea() +
                " Perimeter = " + getPerimeter();
    }
}
