package MentoringSessions.Sena.March25;

public class StringMethods {
    /*
     * String Methods:
     * toLowerCase()
     * toUpperCase()
     * equals()
     * equalsIgnoreCase()
     * startsWith()
     * endsWith()
     * contains()
     * length()
     * charAt()
     * indexOf()
     * substring()
     * replace()
     * replaceAll()
     * trim()
     */

    public static void main(String[] args) {

        String myString = "Hello World";
        //  REMEMBER THAT STRINGS ARE IMMUTABLE, IT CANNOT BE CHANGED

        // Task 1: to capitalize all letters?
        System.out.print(myString.toUpperCase());
        System.out.println(" ------------------------- 1 -");

        // Task 2: to have all small case letters?
        System.out.print(myString.toLowerCase());
        System.out.println(" ------------------------- 2 -");

        // Task 3: to change something with another thing within the String?
        System.out.print(myString.replace("Hello", "Hi"));
        // while using replace, first include the oldChar then newChar
        System.out.println(" ------------------------- 3 -");

        // Task 4: test if the String has the word "World"
        System.out.println(myString.contains("World"));     // 1. Way
        System.out.print(myString.endsWith("World"));     // 2. Way
        System.out.println(" ------------------------- 4 -");

        // Task 5: test if the String has the word "hi"
        System.out.print(myString.contains("hi"));
        System.out.println(" ------------------------- 5 -");

        // Task 6: test if the String starts with "Ha"
        System.out.print(myString.startsWith("Ha"));
        System.out.println(" ------------------------- 6 -");

        // Task 7: test if the String ends with "world"
        System.out.print(myString.endsWith("world"));
        // this code will give you boolean result "false" since Java is case sensitive
        System.out.println(" ------------------------- 7 -");


    }
}
