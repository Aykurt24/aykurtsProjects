package JavaTechnoStudy.day43.extendsKeyword.ex2;

public class Apple extends Fruit {

    //constructor are not inherited
    //but you can reuse them using super keyword

    public Apple(String name) {
        super(name);
        super.name = name;

    }
}
