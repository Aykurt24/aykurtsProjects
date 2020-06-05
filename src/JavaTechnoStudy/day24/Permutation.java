package JavaTechnoStudy.day24;

public class Permutation {
    static void printPermutn(String str, String str1) {
        if (str.length() == 0) {
            System.out.print(str1 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String str2 = str.substring(0, i) +
                    str.substring(i + 1);

            printPermutn(str2, str1 + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abb";
        printPermutn(s, "");
    }
}

