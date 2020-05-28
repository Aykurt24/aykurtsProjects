package moreAboutJava.findingNumberOfLetterAndDigit;

public class CountingLettersInString {

    // create a method which checks if character is letter
    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character);
        return character >= 'a' && character <= 'z';
    }

    // create a method which counts letters in given string
    public static int letterCount(String str) {
        int counter = 0;
        //String str = "@2Dogan#%"

        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (isLetter(aChar)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String str = "ThecnoStudy1@3$6";
        System.out.println("Number of letters in string : " + letterCount(str));
    }
}
