package JavaTechnoStudy.day7;

public class Task2 {


    //print your name in "UPPERCASE" and surname in "lowercase"

    public static void main(String[] args) {
        String firstName = "ATAY";
        String lastName = "olric";

        System.out.println(firstName.toUpperCase() + " " + lastName.toLowerCase());

        String name = "Michael";
        String surname = "Jackson";

        name = name.toUpperCase();
        surname = surname.toLowerCase();
        System.out.println(name + " " + surname);
        System.out.println(name.concat(" ").concat(surname));


    }

}
