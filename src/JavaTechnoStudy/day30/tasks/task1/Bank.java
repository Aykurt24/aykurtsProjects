package JavaTechnoStudy.day30.tasks.task1;

public class Bank {
    String name;                  // 1st attribute
    int serial;                  // 2nd attribute
    boolean trustworthiness;    // 3rd attribute

    // First constructor
    public Bank() {
        name = "Unknown";        // instance + parameter
    }

    // Second constructor
    public Bank(String name, int serial) {
        this.name = name;                   // this burada yukaridan ilgili parametreyi cagiriyor
        this.serial = serial;              // this burada yukaridan ilgili parametreyi cagiriyor
    }

    // Third constructor
    public Bank(String name, int serial, boolean trustworthiness) {

        this(name, serial);
        this.trustworthiness = trustworthiness;
    }

    // Four, please, don't do it like this
    public Bank(int serial) {

        this("Bank four", serial, false);
    }


    public static Bank nonTrustworthyBank(String name, int serial) {

        return new Bank(name, serial);
    }

    public String toString() {                         // String Method
        return "\n---------------------------" +
                "\nName: " + this.name +
                "\nSerial: " + this.serial +
                "\nTrustworthiness: " + this.trustworthiness +
                "\n---------------------------"
                ;


    }
}
