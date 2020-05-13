package MentoringSessions.Achilov;

public class DoWhileLoop {


    public static void main(String[] args) {

        int x = 1;              // initialization

        do {                    // do condition
            if (x % 2 == 0) {
                System.out.println(x + " ");
            }
            x++;                    // iterator
        } while (x <= 40);          // while condition
    }
}
