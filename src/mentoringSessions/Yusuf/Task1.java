package mentoringSessions.Yusuf;

public class Task1 {

    //Create a method that checks every letter if they are vowel
    // or not and tells the number of vowels in a String

    public static void main(String[] args) {
        System.out.println(vowelCount("I love my mentor"));
    }

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
}


//    // second way:
//    // Function to check the Vowel
//    static boolean isVowel(char ch)
//    {
//        ch = Character.toUpperCase(ch);
//        return (ch=='A' || ch=='E' || ch=='I' ||
//                ch=='O' || ch=='U');
//    }
//
//    // Returns count of vowels in str
//    static int countVowels(String str)
//    {
//        int count = 0;
//        for (int i = 0; i < str.length(); i++)
//            if (isVowel(str.charAt(i))) // Check for vowel
//                ++count;
//        return count;
//    }
//
//    // Driver code
//    public static void main(String args[])
//    {
//        //string object
//        String str = "I love Techno Study";
//
//        // Total numbers of Vowel
//        System.out.println(countVowels(str));
//    }
//}