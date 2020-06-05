package JavaTechnoStudy.day49.tasks.task1;

public class SpaceShip implements Vehicle, Flying {

    @Override
    public String fly() {
        return "in Space";
    }

    @Override
    public int speed() {
        return 15_500;
    }
}
