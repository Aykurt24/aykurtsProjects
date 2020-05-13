package MentoringSessions;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        String text = "Hello World";

        // System.out.println(text.startsWith("Hello")); //true
        // System.out.println(text.startsWith("World")); //false
        // System.out.println(text.startsWith("hello")); //false _ case sensitive

        // System.out.println(text.endsWith("Hello")); //false
        // System.out.println(text.endsWith("World")); //true _ case sensitive
        // System.out.println(text.toUpperCase()); // HELLO WORLD
        // System.out.println(text.toLowerCase()); //hello world
        // System.out.println(text
        // .replace("Hello","Hi")
        // .replace("World","Everyone" ));
        // System.out.println(text.replace("Hello World","Hi Everyone"));
        // System.out.println(text.replace('H','Y'));

        // String text1 = "Hello World Hello!!!";
        // System.out.println(text1.replace("Hello","Hi"));

        // String text2 = "       Hey   !           ";
        // System.out.println("&" + text2.trim() +"&");

            /*
            String text3 = "Hello world Hello";
            System.out.println(text3.replaceAll("[A-Z]","y")); //yello world yello
            System.out.println(text3.replaceAll("[a-z]","Y")); //HYYYY YYYYY HYYYY

            String text4 = "Hello 2020";
            System.out.println(text4.replaceAll("[0-9]","CORONA")); //Hello CORONACORONACORONACORONA

            String text5 = "Hello World Hello";
            System.out.println(text5.replaceAll("[C-K]","T")); //Tello World Tello
            System.out.println(text5.replaceAll("[c-k]","T")); //HTllo WorlT HTllo
            */

        // String text6 = "SOFTWARE DEVELOPER in TEST a very good method";
        //System.out.println( Arrays.toString(text6.split( " " )) );

        // System.out.println(Arrays.toString(text6.split(" "))); //[[0}SOFTWARE, [1]DEVELOPER, [2]in, [3]TEST]
        // String text7 = "Software DEVELOPERSSSS in Test";
        //System.out.println(Arrays.toString(text7.split(["A-Z"])); //[Software DEVELOPE, in Test]

        String text8 = "Good evening everybody";
        System.out.println("original: " + text8);
        System.out.println("after split with ' ':" + Arrays.toString(text8.split(" ")));
    }
}
