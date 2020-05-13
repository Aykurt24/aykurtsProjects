package JavaTechnoStudy.day32.nonAccessModifier.staticModifier;

public class Person {
    static String planetName;
    String name;

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        Person.planetName = "Earth";
        person1.print();

        Person person2 = new Person();
        person2.name = "Alice";
        Person.planetName = "Mars";
        person2.print();

        System.out.println("After expedition");
        person1.print();
        person2.print();


    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Planet: " + planetName);
        System.out.println();
    }
}
