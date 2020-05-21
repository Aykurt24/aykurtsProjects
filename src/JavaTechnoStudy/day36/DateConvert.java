package JavaTechnoStudy.day36;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter desired date(M/d/yy):");
        String text = scanner.nextLine();

        LocalDate date = LocalDate.parse(text, DateTimeFormatter.ofPattern("M/d/yy"));

        System.out.println("converted to LocalDate: " + date);

        System.out.println(LocalDate.of(2014, 6, 21));
        try {
            LocalDate date1 = LocalDate.of(2018, Month.APRIL, 40);
            System.out.println(date.getYear() + " " + date.getMonth() + " "
                    + date.getDayOfMonth());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex);
        }

        LocalDate date1 = LocalDate.of(2018, Month.APRIL, 30);
        date = date.plusDays(2).plusYears(3);


        System.out.println(date.getYear() + " " + date.getMonth() + " "
                + date.getDayOfMonth());


    }
}
