package JavaTechnoStudy.day50.tasks.task2;

import JavaTechnoStudy.day50.tasks.task2.food.*;

import java.util.ArrayList;
import java.util.List;

public class TechnoCafe {

    public static void main(String[] args) {
        List<Food> mondayMenu = new ArrayList<>();
        mondayMenu.add(new AdanaKebab());
        mondayMenu.add(new Lahmacun());
        mondayMenu.add((new Palov()));
        mondayMenu.add((new Borsh()));

        Kitchen yusufKitchen = new Kitchen();

        for (Food food : mondayMenu) {
            yusufKitchen.cook(food);
        }

    }
}