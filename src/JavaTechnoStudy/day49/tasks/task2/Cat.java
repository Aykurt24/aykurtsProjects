package JavaTechnoStudy.day49.tasks.task2;

public class Cat implements Animal, AnimalsSpeed {
    @Override
    public String eat() {
        return "Rat";
    }

    @Override
    public int speed() {
        return 4;
    }


}
