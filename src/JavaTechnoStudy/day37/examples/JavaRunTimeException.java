package JavaTechnoStudy.day37.examples;

public class JavaRunTimeException {

    public static void main(String[] args) {
//        String str = "";
//
//        str.charAt(0);

        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Check your variables");
            System.out.println(e);
        }

        int c = 5;
        int d = 6;
        System.out.println(c + d);

    }


}

