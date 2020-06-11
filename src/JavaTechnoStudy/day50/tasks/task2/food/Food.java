package JavaTechnoStudy.day50.tasks.task2.food;

public interface Food {
    static void aa() {

    }

    String taste();


    //print how it taste
    default void print() {
        System.out.println("food taste: " + taste());
    }


}
