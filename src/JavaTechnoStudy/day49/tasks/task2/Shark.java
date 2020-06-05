package JavaTechnoStudy.day49.tasks.task2;

public class Shark implements Animal, AnimalsSpeed, SwimingAnimals {
    @Override
    public String eat() {
        return "Other fishes";
    }

    @Override
    public int speed() {
        return 45;
    }

    @Override
    public String living() {
        return "in the Ocean";
    }


}
