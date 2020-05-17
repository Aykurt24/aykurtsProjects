package JavaTechnoStudy.day30.tasks.task1;

public class Task1 {

    // in Task1 class create
    // at least 4 object of that class
    public static void main(String[] args) {
        Bank bank1 = new Bank(); // object
        System.out.println("Bank1: " + bank1);


        Bank bank2 = new Bank("Bank of America", 1010111);    // object
//        bank2 = Bank.nonTrustworthyBank("Bank of America", 1010111);
        System.out.println("Bank2: " + bank2);

        Bank bank3 = new Bank("Chase", 3344967, true);    // object
        System.out.println("Bank3: " + bank3);


        Bank bank4 = new Bank();             // object
        bank4.name = "Halk Bank";
        System.out.println("Bank4: " + bank4);


        Bank bank5 = new Bank(101010);         // object
        System.out.println("Bank5: " + bank5);


    }
}
