package JavaTechnoStudy.day41.task;

import java.time.LocalDate;
import java.time.Month;

public class AmazonStore {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setName("Mark Twain: Five Novels (Leather-bound Classics)");
        book1.setAuthor("Mark Twain and Elizabeth Boyle Machlan PhD");
        book1.setPublishedDate(LocalDate.of(2011, Month.NOVEMBER, 1));
        book1.setLeatherBoundPrice(16.69);
        book1.setHardCoverPrice(10.49);
        book1.setAudioBookPrice(0.0);

        Book book1a = new Book("Mark Twain: Five Novels (Leather-bound Classics)",
                "Mark Twain and Elizabeth Boyle Machlan PhD",
                LocalDate.of(2011, Month.NOVEMBER, 1),
                16.69,
                10.49,
                0.0
        );

        Book book2 = new Book();
        book2.setName("Jane Austen: The Complete Works 7-Book Boxed Set");
        book2.setAuthor("Jane Austen and Coralie Bickford-Smith");
        book2.setPublishedDate(LocalDate.of(2015, Month.NOVEMBER, 24));
        book2.setHardCoverPrice(109.61);

        Book book2a = new Book("Jane Austen: The Complete Works 7-Book Boxed Set",
                "Jane Austen and Coralie Bickford-Smith",
                LocalDate.of(2015, Month.NOVEMBER, 24),
                null,
                109.61,
                null
        );

        Book book3 = new Book("Little Women (Puffin in Bloom)", "Louisa May Alcott", LocalDate.of(2014, Month.AUGUST, 28));
        book3.setHardCoverPrice(11.99);
        book3.setAudioBookPrice(0.0);
    }

    public void wrongBooks() {
//        Little Women
//        by Jane Austen and Coralie Bickford-Smith | Nov 24, 2015
//        Hardcover $109.61

        //cant create a book without "Leather Bound" and "Audiobook" prices
//        WrongBook book = new WrongBook("Little Women",
//                null,
//                109.61,
//                null);
    }
}
