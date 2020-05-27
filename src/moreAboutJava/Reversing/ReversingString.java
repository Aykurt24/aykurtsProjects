package moreAboutJava.Reversing;

public class ReversingString {
    public static void main(String[] args) {

        String str = "Dogan";
        char[] letters = new char[str.length()];
        int letterIndex = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            letters[letterIndex] = str.charAt(i);
            letterIndex++;
        }

        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            reverseStr = reverseStr + letters[i];
        }
        System.out.println(reverseStr);
    }


}
