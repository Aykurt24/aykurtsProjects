package JavaTechnoStudy.day45.staticBlock;

public class Ex1 {

    static {
        print();
    }

    public static void print() {
        System.out.println("Hello");
    }

    public Ex1() {

        System.out.println("Hello from default method");

    }

    public Ex1(String name, int age) {
        System.out.println(name + " " + age);
    }


    public static void main(String[] args) {
        new Ex1("Dogan", 29);
        new Ex1();
        System.out.println("Hello from main");

    }
}