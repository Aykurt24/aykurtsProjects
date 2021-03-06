package JavaTechnoStudy.day37.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaCheckedException {

    public static void main(String[] args) {
        //        File file = new File("example.txt");

        //checked(expected) exception must be used with try-catch
        //we can predict it before we execute/do that
        try {
            FileInputStream fis = new FileInputStream("example.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);

        }

    }
}