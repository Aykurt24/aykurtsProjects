package moreAboutJava.reversing;

public class ReversinStringInArray {

    public static void main(String[] args) {

        String[] array = {"Dogan", "Yakup", "Ali"};
        reverse(array);
    }

    public static void reverse(String[] array) {

        for (int i = 0; i < array.length; i++) {

            char[] ch = array[i].toCharArray();
            System.out.println();

            for (int j = ch.length - 1; j >= 0; j--) {
                System.out.print(ch[j] + " ");

            }


        }

    }
}
