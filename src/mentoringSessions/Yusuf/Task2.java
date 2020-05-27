package mentoringSessions.Yusuf;

public class Task2 {

    //Create a method which has 2 String parameters and counts the vowels inside them
    //return true if they have same amount of vowels, if not false

    public static int vowelCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'u' || str.charAt(i) == 'o') {
                count++;
            }
        }
        return count;
    }

    public static boolean sameAmountCheck(String a, String b) {
        return vowelCount(a) == vowelCount(b); // return true;
    }
}
