package JavaTechnoStudy.day45.questions.q1;

class A {                       // Grand Parent
    String s = "Class A";
}

class B extends A {                 // Parent
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C extends B {                 // Child
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class Q2 {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}