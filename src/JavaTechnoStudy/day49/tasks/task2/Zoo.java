package JavaTechnoStudy.day49.tasks.task2;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Cat eat : " + cat.eat() + "\nSpeed of Cat : " + cat.speed());
        System.out.println("================================================================");

        Shark shark = new Shark();
        System.out.println("Shark eat : " + shark.eat() + "\nSpeed of Shark : " + shark.speed()
                + "\nShark live : " + shark.living());
        System.out.println("================================================================");

        Swallow swallow = new Swallow();
        System.out.println("Swallow eat : " + swallow.eat() + "\nSwallow of Speed : " + swallow.speed()
                + "\nSwallow living : " + swallow.fly());
        System.out.println("================================================================");

        Duck duck = new Duck();
        System.out.println("Duck eat : " + duck.eat() + "\nDuck of speed : " + duck.speed()
                + "\nDuck living : " + duck.living());


    }

}
