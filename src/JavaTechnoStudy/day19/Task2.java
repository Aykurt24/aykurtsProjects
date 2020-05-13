package JavaTechnoStudy.day19;

public class Task2 {
    // create a method which checks if length of string is at least 8 characters
    public static boolean checkLength(String text) {
        return text.length() >= 8;
    }

    // try to ovoid writing redundant code
    public static boolean checkLength2(String text) {
        return text.length() >= 8;
    }

    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character);

        boolean isLetter = character >= 'a' && character <= 'z';
        return isLetter;

    }
}
