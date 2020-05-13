package JavaTechnoStudy.day33.javaEnum.ex2;

public class Book {
    private String name;
    private BookCategory bookCategory;

    public Book(String name, BookCategory bookCategory) {   // constructor
        this.name = name;                                   // instance
        this.bookCategory = bookCategory;
    }

    public BookCategory getBookCategory() {

        return this.bookCategory;
    }


    public String toString() {
        return "\nBook" +
                "\nname: " + name +
                "\nbookCategory: " + bookCategory;
    }
}
