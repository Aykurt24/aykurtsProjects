package JavaTechnoStudy.day49.tasks.task2;

public class Swallow implements Animal, AnimalsSpeed, FlyingAnimals {
    @Override
    public String eat() {
        return "Bugs";
    }

    @Override
    public int speed() {
        return 65;
    }

    @Override
    public String fly() {
        return "In the air";
    }

}
