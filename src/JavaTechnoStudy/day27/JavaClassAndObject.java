package JavaTechnoStudy.day27;

public class JavaClassAndObject {

    public static void main(String[] args) {
        Car toyota = new Car();             // This is our object to call instance variable which is inside of "CAR" class.
        toyota.model = "Toyota Camry";      // Shortly, to create an object helps us to call variable which is in the other class.
        toyota.manufactureDate = 2020;
        toyota.motorSize = 2.4;

        System.out.println("Model: " + toyota.model);
        System.out.println("Manufacture Date: " + toyota.manufactureDate);
        System.out.println("Motor Size: " + toyota.motorSize);
    }
}

class Car {
    // attributes/fields/instance variables
    String model;
    int manufactureDate;
    double motorSize;
}
