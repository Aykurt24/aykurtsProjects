package JavaTechnoStudy.day45.initializerBlock;

public class School {

    //this code will execute before every constructor call
    {
        System.out.println("Initializer Block");
    }

    //this code will execute before every constructor call
    {
        System.out.println("Initializer Block 1");
    }


    public School() {
        System.out.println("Constructor");
    }

    //this code will execute before every constructor call
    static {
        System.out.println("Initializer Block 2");
    }


    public static void main(String[] args) {

        System.out.println("main");
        new School();

    }

}