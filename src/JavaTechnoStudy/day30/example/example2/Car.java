package JavaTechnoStudy.day30.example.example2;

public class Car {
    String model;
    String year;
    double engine;
    String color;

    public Car() {   // constructor
    }

    public Car(String model, String color, String year, double engine) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    public void printMyCar() {
        String model = "My car model";
        System.out.println("Model: " + this.model
                + "\nColor: " + this.color
                + "\nYear: " + this.year
                + "\nEngine: " + this.engine);
    }


}

class JavaThisKeyWords {


    public static Car createCar(String model) {
        Car car = new Car();
        car.model = model;

        return car;
    }

    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Black", "2017", 1.5);
        Car car3 = new Car("Ford", "Orange", "2019", 1.8);

        car1.printMyCar();
        System.out.println("==========================");
        car3.printMyCar();

        Car car2 = new Car();
        car2.model = "Ford";
        car2.color = "Black";
        car2.year = "2017";
        car2.engine = 1.5;

        Car car4 = new Car();
        car4.model = "Ford";
        car4.color = "Black";
        car4.year = "2017";
        car4.engine = 1.5;
        System.out.println("==========================");
        car4.printMyCar();

    }
}

