package JavaTechnoStudy.day4;

public class Task5 {

// Print the ASCII value of character 'M'. bir harfin harf degerini nasil kodlariz

    public static void main(String[] args) {

//        char ch = 'M';
//        int ascii = ch;
//        System.out.println(ascii);

        int number = 68;
        char aChar = (char) number;
        System.out.println("converting " + number + " to char, will give me + aChar");

        System.out.println();

        String result = "converting " + number + " to char, will give me " + aChar;
        System.out.println(result);

        System.out.println();

        char far = 'S';
        int ascii = far;
        System.out.println(ascii);
    }
}
