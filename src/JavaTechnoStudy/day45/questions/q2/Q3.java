package JavaTechnoStudy.day45.questions.q2;

public class Q3 {

}

class A {                             // Grand Parent
    static {
        System.out.println("A");
    }
}

class B extends A {                     // Parent
    static {
        System.out.println("B");
    }
}

class C extends B {                     // Child and Grand Child
    static {
        System.out.println("C");
    }

    public static void main(String[] args) {
        new C();
    }
}

