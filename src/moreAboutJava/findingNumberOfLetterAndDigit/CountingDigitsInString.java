package moreAboutJava.findingNumberOfLetterAndDigit;

public class CountingDigitsInString {
    // create a method which checks if character is digit
    public static boolean isDigit(char character) {
        return character >= '0' && character <= '9';
    }

    // create a method which counts digits in given string
    public static int digitCount(String str) {
        int counter = 0;
        //String str = "@2Dog4an#5%"
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (isDigit(aChar)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String str = "Dogan24.N23";
        System.out.println("Number of digits in string : " + digitCount(str));
    }
}
