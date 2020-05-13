package JavaTechnoStudy.day29.tasks.task2;

/*
***Part 1***
create class Login with attributes
1. username
2. password
 */
public class Login {  //class name
    String username;
    String password;
    String role;      //admin, user

    public static Login createAdmin(String u, String p) {
        Login login = new Login();
        login.username = u;
        login.password = p;
        login.role = "Admin";             //this area is called as 'field'

        return login;
    }

    public static Login createUser(String u, String p) {
        Login login = new Login();
        login.username = u;
        login.password = p;
        login.role = "User";

        return login;
    }

    /*
    ***Part 3***
    create instance method in Login to check
    if username and password are not empty and not null
     */
    public void check() {
        if (StringUtils.isBlank(username)) {
            System.out.println("Username is null or empty");
        }

        if (StringUtils.isBlank(password)) {
            System.out.println("Password is null or empty");
        }
    }

}
