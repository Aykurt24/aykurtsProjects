package JavaTechnoStudy.day49.tasks.task1;

public class Ship implements Vehicle, Sailing {

    @Override
    public String sail() {
        return "Titanic";
    }

    @Override
    public int speed() {
        return 150;
    }
}



