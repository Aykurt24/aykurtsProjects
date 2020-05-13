package JavaTechnoStudy.day7;

public class Task3 {

    //  Write a Java program to replace all the 'd' characters with 'f' characters
    //      input: The quick brown fox jumps over the lazy dog.
    //      output: The quick brown fox jumps over the lazy fog.

    // part 2:
    // replace all the 'a','t','e' characters with 'f'

    // part 3:
    // replace all the 'o','q','r' characters with 'L' using regex}

    public static void main(String[] args) {

        String text = "The quick brown fox jumps over the lazy dog.";
        System.out.println("original: " + text);
        System.out.println("output1: " + text.replace("d", "f"));

        System.out.println();

        System.out.println("output2: " + text.replace("a", "f").replace("t", "f").replace("e", "f"));

        System.out.println();

        System.out.println("after replaceAll: " + text.replaceAll("[A-Z]", "L"));
        System.out.println("output3: " + text.replace("o", "L").replace("q", "L").replace("r", "L"));


    }
}



