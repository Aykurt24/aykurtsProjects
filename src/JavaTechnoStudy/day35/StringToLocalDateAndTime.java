package JavaTechnoStudy.day35;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDateAndTime {

    public static void main(String[] args) {
        String strDate = "01/25/2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(strDate, formatter);


        // System.out.println(strDate);
        System.out.println(formatter.format(localDate));

        String strTime = "12:49";
        LocalTime localTime = LocalTime.parse(strTime);
        System.out.println(localTime);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
//
//        String date = "16/08/2016";
//
//        LocalDate localDate = LocalDate.parse(date, formatter);
//
//        System.out.println(localDate);
//
//        System.out.println(formatter.format(localDate));
//
    }
}
