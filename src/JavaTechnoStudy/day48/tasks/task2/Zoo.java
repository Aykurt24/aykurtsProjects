package JavaTechnoStudy.day48.tasks.task2;


import JavaTechnoStudy.day48.tasks.task2.cat.Cat;
import JavaTechnoStudy.day48.tasks.task2.cat.Lion;
import JavaTechnoStudy.day48.tasks.task2.cat.RagDoll;
import JavaTechnoStudy.day48.tasks.task2.cat.Tiger;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        List<Cat> myCats = new ArrayList<>();
        myCats.add(new Cat());
        myCats.add(new Lion());
        myCats.add(new Tiger());
        myCats.add(new RagDoll());

        for (Cat myCat : myCats) {
            System.out.println(myCat);
        }
        System.out.println("=============================");
        option1();
    }

    public static void option1() {
        AbstractAnimal tom = new Cat();
        System.out.println("Tom: " + tom.sound());

        AbstractAnimal petro = new RagDoll();
        System.out.println("Petro: " + petro.sound());

        AbstractAnimal simba = new Lion();
        System.out.println("Simba: " + simba.sound());

        AbstractAnimal diego = new Tiger();
        System.out.println("Diego: " + diego.sound());
    }
}
