package JavaTechnoStudy.day41;

//To achieve encapsulation in Java
public class User {

    //Declare the variables of a class as private.
    private String username;
    private String password;
    //private String address;


    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
        // setAddress(address);

    }

    //Provide public setter and getter methods to modify and view the variables values.

    //Getter methods to view/retrieve
    //to make read-only(can retrieve, but cant modify) remove all setter methods
    public String getUsername() {
        return this.username;
    }

    //Setter methods to modify
    //to make write-only(can modify, but cant retrieve) remove all getter methods
    public void setUsername(String username) {

        if (username.contains("@")) {
            throw new IllegalArgumentException("User name should not have @ ");
        }
        if (username.isEmpty()) {
            throw new IllegalArgumentException("Provide a user name please");
        }

        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        //password must have at least length of 6

        if (password.length() < 6) {
            throw new IllegalArgumentException("Password is too short, please provide longer password");
        }
        if (password.length() > 10) {
            throw new IllegalArgumentException("Password is too long, please provide shorted password");
        }

        this.password = password;
    }

//    public String getAddress() {
//        return address;
//    }

//    public void setAddress(String address) {
//
//            if (address.length() > 6){
//                throw new IllegalArgumentException("Address is too long ");
//            }
//
//
//
//
//        this.address = address;
//    }


}
