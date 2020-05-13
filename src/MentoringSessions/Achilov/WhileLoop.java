package MentoringSessions.Achilov;

public class WhileLoop {

    public static void main(String[] args) {

        // example
        // get even numbers (range 0-50)

        int x = 1;               // initialization

        while (x <= 50) {       // while condition
            if (x % 2 == 0) {    // statements
                System.out.print(x + " ");
            }
            x++;              // iterator
        }
    }
}
