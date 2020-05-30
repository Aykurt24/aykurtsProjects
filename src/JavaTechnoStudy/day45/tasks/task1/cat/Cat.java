package JavaTechnoStudy.day45.tasks.task1.cat;

import JavaTechnoStudy.day45.tasks.task1.Animal;
import JavaTechnoStudy.day45.tasks.task1.Gender;

public class Cat extends Animal {


    public Cat(int id, String name, String color, int age, Gender gender, String orgin) {
        super(id, name, color, age, gender, orgin);
    }


    @Override
    public String eat() {
        return "eats too much";
    }
}
