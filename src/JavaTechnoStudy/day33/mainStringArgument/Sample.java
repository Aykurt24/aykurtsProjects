package JavaTechnoStudy.day33.mainStringArgument;

public class Sample {
    // 05/18/2020 Albayim(Yakup) , Yuzbasi (Yusuf) and (Astegmen) Umare
    public static void main(String[] args) {

        args = new String[2];
        args[1] = "@";
        args[0] = "2.3";

        System.out.println("Argument at index 0:" + args[1]);

        for (String argument : args) {
            System.out.println(argument);
        }

    }

    public static void Dogan(String[] args) {
        System.out.println("Argument at index 0:" + args[0]);

        for (String argument : args) {
            System.out.println(argument);

        }

    }
}