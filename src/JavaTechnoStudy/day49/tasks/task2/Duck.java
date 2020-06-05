package JavaTechnoStudy.day49.tasks.task2;

public class Duck implements Animal, AnimalsSpeed, SwimingAnimals {
    @Override
    public String eat() {
        return "Fish";
    }

    @Override
    public int speed() {
        return 45;
    }

    @Override
    public String living() {
        return "Water and Air";
    }


}
