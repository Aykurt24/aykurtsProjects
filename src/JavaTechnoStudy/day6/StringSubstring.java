package JavaTechnoStudy.day6;

public class StringSubstring {

    /*
     substring()

    Extracts the characters from a string,
    beginning at a specified start position,
    and through the specified number of character

    String
     */

    public static void main(String[] args) {
        String text = "Hello there!!!";
        System.out.println(text.substring(1, 5));
        System.out.println("1. " + text.substring(1, 5));
        System.out.println("2. " + text.substring(6));

        System.out.println("3. " + text.substring(16));
    }
}
