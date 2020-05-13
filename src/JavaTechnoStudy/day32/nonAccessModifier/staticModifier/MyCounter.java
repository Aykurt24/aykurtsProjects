package JavaTechnoStudy.day32.nonAccessModifier.staticModifier;

/*
static
Attributes and methods belongs to the class, rather than an object
 */
public class MyCounter {
    public static int staticCounter = 0;
    private final String name;
    public int counter = 0;

    public MyCounter(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MyCounter myCounter1 = new MyCounter("myCounter1");
        myCounter1.increase();

        MyCounter myCounter2 = new MyCounter("myCounter2");
        myCounter2.increase();
    }

    public void increase() {
        staticCounter++;
        counter++;
    }

}
