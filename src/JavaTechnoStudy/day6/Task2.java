package JavaTechnoStudy.day6;

public class Task2 {

    public static void main(String[] args) {

        String str = "Yakup Bulut";
        String m = str.substring(0, 1);
        String n = str.substring(6, 7);
        System.out.println(m + "." + n + ".");

        // given your name and surname
        // please write initials
        // input
        // str = Michael Jackson
        // output
        // M.J.

        // part 2, using CharArt
        char f = str.charAt(0);
        char j = str.charAt(8);
        System.out.println(f + "." + j + ".");


    }
}