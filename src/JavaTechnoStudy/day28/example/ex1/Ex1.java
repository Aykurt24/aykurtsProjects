package JavaTechnoStudy.day28.example.ex1;

 class Person {
     /*
     A variable which is created inside the class but outside the method is known as an instance variable.
     Instance variable doesn't get memory at compile time.
     It gets memory at runtime when an object or instance is created.
     That is why it is known as an instance variable.
      */
     String name;
     String surname;
     int age;

    // when you have methods that are not static
    // they are instance methods
    int getBirthYear() {
        return 2020 - age;
    }

    String getInitials() {
        return name.charAt(0) + "." + surname.charAt(0) + ".";
    }

     void print() {
         System.out.println("Name: " + name);
         System.out.println("Surname: " + surname);
         System.out.println("Age: " + age);
         System.out.println("Birth Year: " + getBirthYear());
         System.out.println("Initials: " + getInitials());
     }
}

public class Ex1 {
    // create a program that calculates
    // birth year of given person

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Yusuf";
        person1.surname = "Esenboga";
        person1.age = 25;
        //int birthYearYusuf = person1.getBirthYear();
        //String initials = person1.getInitials();
        person1.print();

        System.out.println("================");

        Person person2 = new Person();
        person2.name = "Dos";
        person2.surname = "As";
        person2.age = 31;
        //int birthYearDos = person2.getBirthYear();
        person2.print();

        System.out.println("================");

        Person person3 = new Person();
        person3.name = "Mark";
        person3.surname = "dsd";
        person3.age = 69;
        //int birthYearMark = person3.getBirthYear();
        person3.print();

        Person person4 = createPerson("Yakup", "Bulut", 30);
        person4.print();


    }

    public static Person createPerson(String name, String surname, int age) {

        Person person = new Person();

        person.name = name;
        person.surname = surname;
        person.age = age;

        return person;
    }


}
