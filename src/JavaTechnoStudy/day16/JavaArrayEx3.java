package JavaTechnoStudy.day16;

public class JavaArrayEx3 {

    public static void main(String[] args) {
        char[] letters = {'H', 'e', 'l', 'l', 'o'};


        //                 0    1    2    3    4
        System.out.println("Length:" + letters.length);
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        System.out.println("\n-------------");

        for (int i = letters.length - 1; i >= 0; i--) { //**decrement if you want to revers Words or letters you should use this for loop**
            System.out.print(letters[i]);
        }
    }

//    public class JavaArrayEx3 {
//
//        public static void main(String[] args) {
//            String[] names = {"Alice", "Bob", "Trudy"};
//
//
//            //class Arrays
//            String output = Arrays.toString( names );
//            System.out.println(output);
//        }
//
//    }

}
