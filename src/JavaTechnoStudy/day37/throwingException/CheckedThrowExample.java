package JavaTechnoStudy.day37.throwingException;

public class CheckedThrowExample {

    public static void goOutside(int temperature) throws Exception {
        if (temperature < 20) {//very cold weather
            throw new Exception("Its really cold outside, wear something warm");
        }

        System.out.println("Playing basketball outside");
    }

    public static void main(String[] args) {
        try {
            goOutside(20);
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("Stay at home and play basketball");
        }
    }
}
