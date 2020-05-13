package JavaTechnoStudy.day31.tasks.task3;

public class ExQ3 {

    public static void main(String[] args) {
        System.out.println("Grav: " + getGravity());
    }

    private static double getGravity() {
        return 9.8;
    }

    public void calculateSpeed() {
        double speed = 10 * getGravity();
    }


}
