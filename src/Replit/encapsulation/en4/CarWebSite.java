package Replit.encapsulation.en4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarWebSite {
    private String brandOfCar, manufacturedYear;
    private int doorCount;

    public void setBrandOfCar(String brandOfCar) {
        this.brandOfCar = brandOfCar;
    }

    public void setManufacturedYear(String manufacturedYear) {
        LocalDate current = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate manufYear = LocalDate.parse(manufacturedYear, formatter);
        int year = manufYear.getYear();
        int currentYear = current.getYear();
        int age = currentYear - year;

        while (age < 10) {
            if (doorCount == 2 || doorCount == 4) {
                System.out.println("brand of the car=" + "'" + brandOfCar + "'," +
                        " manufactured date=" + "'" + manufacturedYear + "'," +
                        " door count=" + doorCount);
                age++;
                break;
            } else {
                System.out.println("This is not a valid search");
                age++;
                break;
            }
        }
        while (age > 10) {
            System.out.println("This is not a valid search");
            age++;
            break;
        }

        this.manufacturedYear = manufacturedYear;
    }

    public void setDoorCount(int doorCount) {

        this.doorCount = doorCount;
    }


    public String toString() {
        return "";

    }
}
