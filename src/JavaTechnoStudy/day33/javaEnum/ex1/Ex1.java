package JavaTechnoStudy.day33.javaEnum.ex1;

public class Ex1 {

    public static void main(String[] args) {
        User user1 = new User();
        user1.role = Role.ADMIN;
        user1.status = Status.ACTIVE;
        System.out.println(user1);

        Role myRole = Role.ADMIN;
        System.out.println(myRole);

        //Enums are often used in switch statements to check for corresponding values:
    }
}
