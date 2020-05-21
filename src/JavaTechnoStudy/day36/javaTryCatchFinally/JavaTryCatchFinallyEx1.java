package JavaTechnoStudy.day36.javaTryCatchFinally;

import java.time.LocalDate;
import java.time.Month;

public class JavaTryCatchFinallyEx1 {

    public static void main(String[] args) {

        try {
            LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 29);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Please provide correct date");
        }


        ///
        try {
            //learn java
        } catch (Exception ex) {
            //dont understand
            //to fast topics
            //difficult replt questions
            //no time
        } finally {
            //I'm gonna be a SDET in 6 month
            //I'm gonna have 300_000$ in 6 month
        }
    }
}