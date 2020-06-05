package JavaTechnoStudy.day49.tasks.task1;

public class AirPlane implements Vehicle, Flying {
    @Override
    public String fly() {
        return "F16";
    }


    @Override
    public int speed() {
        return 575;
    }
}
