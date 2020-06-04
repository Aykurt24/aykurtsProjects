package JavaTechnoStudy.day45.tasks.task1;

import JavaTechnoStudy.day45.tasks.task1.cat.Lion;
import JavaTechnoStudy.day45.tasks.task1.cat.Tiger;

public class Zoo {

    public static void main(String[] args) {
        Tiger tiger = new Tiger(1,                            // == Tiger tiger = new Tiger ();
                "Richard Parker",
                "gold/orange/black",
                3,
                Gender.MALE,
                "Bengal Tiger"
        );
        System.out.println(tiger);


        System.out.println(new Lion(2,
                "Aslan",
                "gold",
                5000,
                Gender.MALE,
                "Narnia"
        ));

    }
}
