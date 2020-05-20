package JavaTechnoStudy.day33.javaEnum;

//The Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

class Vehicle {
    protected String brand = "Ford";         // Vehicle attribute

    public void honk() {                     // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}