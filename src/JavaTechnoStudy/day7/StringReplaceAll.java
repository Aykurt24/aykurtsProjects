package JavaTechnoStudy.day7;

public class StringReplaceAll {
    /*
    replaceAll()

    Replaces each substring of this string that matches
    the given regular expression with the given replacement

    String
     */

    public static void main(String[] args) {
        String text = "Edit the Expression & Text to see matches";
        System.out.println(text);
        System.out.println(text.replaceAll("[A-Z]", "THE "));

        System.out.println();

        System.out.println("original: " + text);
        System.out.println("after replaceAll: " + text.replaceAll("[A-Z]", "%"));
        System.out.println("after replace: " + text.replace("E", "%").replace("T", "%"));

    }

}