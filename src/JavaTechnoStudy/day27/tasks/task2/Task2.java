package JavaTechnoStudy.day27.tasks.task2;

public class Task2 {

    public static void main(String[] args) {

        // create users and print all attributes of user
        //User user1 = createUser("techno", "19138", "Techno", "Study",
        //"Saint St 90", "04/20/15", "+1 544 77 99", "techno@study.com");
        //printAttributes(user1);

        //User user2 = createUser("dos", "gga38", "Dos", "Santos", "Free St 15", "04/10/15", "+1 444 77 99", "dos@techno.study");
        //printAttributes(user2);

        Profile user3Profile = new Profile();
        user3Profile.firstName = "Eren";
        user3Profile.lastName = "Yager";
        user3Profile.address = "Low St 90";
        user3Profile.birthDate = "03/03/13";
        user3Profile.email = "+1 000 77 99";
        user3Profile.phone = "eren@lost.com";
        user3Profile.nickname = "eresha";

        // User user;
        User user3 = createUser("dogan24", "dodo",
                createProfile("Dogan", "Aykurt",
                        "24.08.1989", "34234", "32141345",
                        "xzwe34", "sdfasd"));
        printAttributes(user3);
        printProfile(createProfile("Dogan", "Aykurt",
                "24.08.1989", "34234", "32141345",
                "xzwe34", "sdfasd"));

    }


    public static User createUser(String username, String password, Profile profile) {
        User user = new User();
        user.username = username;
        user.password = password;


//       user.profile = new Profile();
//
//        user.profile.firstName = profile.firstName;
//        user.profile.lastName = profile.lastName;
//        user.profile.address = profile.address;
//        user.profile.birthDate = profile.birthDate;
//        user.profile.phone = profile.phone;
//        user.profile.email = profile.email;
//        user.profile.nickname = profile.nickname;

        return user;
    }

    public static Profile createProfile(String firstName, String lastName, String birthDate,
                                        String address, String phone, String email,
                                        String nickname) {
        Profile profile = new Profile();
        profile.firstName = firstName;
        profile.lastName = lastName;
        profile.birthDate = birthDate;
        profile.address = address;
        profile.phone = phone;
        profile.email = email;
        profile.nickname = nickname;


        return profile;

    }

    public static void printAttributes(User user) {
        System.out.println("\nUsername: " + user.username);
        System.out.println("Password: " + user.password);
    }

    public static void printProfile(Profile profile) {
        System.out.println("First Name: " + profile.firstName);
        System.out.println("Last Name: " + profile.lastName);

        System.out.println("Address: " + profile.address);
        System.out.println("Birth Date: " + profile.birthDate);
        System.out.println("Phone: " + profile.phone);
        System.out.println("Email: " + profile.email);
    }


}
