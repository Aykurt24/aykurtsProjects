package JavaTechnoStudy.day38.tasks.task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class adsd {

    public static void main(String[] args) {


        String myDOB = "08/11/1989";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateOfBirth = LocalDate.parse(myDOB, formatter);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(dateOfBirth, currentDate).getYears();
        int month = Period.between(dateOfBirth, currentDate).getMonths();

        System.out.println(month);


    }


}
