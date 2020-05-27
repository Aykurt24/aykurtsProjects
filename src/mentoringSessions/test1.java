package mentoringSessions;

public class test1 {
    public static void main(String[] args) {
        String str = "Write a Java";
        String[] a = new String[str.length()];
        a = str.split("");
        //System.out.println(Arrays.toString(a));
        String[] b = new String[str.length()];
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            b[0 + i] = a[str.length() - 1 - i];
            result += a[str.length() - 1 - i];
        }
        System.out.println(result);
        //System.out.println(Arrays.toString(b));


    }

    public static String middleWord(String Word) {
        String[] a = Word.split(" ");
        //System.out.println(Arrays.toString(a));
        Word = a[a.length / 2];
        return Word;
    }


}