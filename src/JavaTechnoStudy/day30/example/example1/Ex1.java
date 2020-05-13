package JavaTechnoStudy.day30.example.example1;

class Book {                  // class
    String name;             // instance or object
    int publishYear;        // instance or object

    public Book() {
    }

    public Book(String name, int year) {    // class method + parameters
        this.name = name;        // this i yukaridaki instance a ulasmak icin kullaniyoruz, (instance + parameter)
        publishYear = year;     // this i yukaridaki instance a ulasmak icin kullaniyoruz, (instance + parameter)
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + this.publishYear);
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Harry Potter";
        book1.publishYear = 2001;
        book1.print();

        Book book2 = new Book("Java For Beginners", 1995);
        book2.print();


        String str = "";
        str = str;
    }
}
