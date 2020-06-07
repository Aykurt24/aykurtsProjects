package saturdayProject9.School;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolLocation {

    static ArrayList<String> locationList;
    private String price, location;

    public SchoolLocation(String location) {
        addLocation();
        setLocationList(location);
        setPrice();
    }

    public static void addLocation() {
        locationList = new ArrayList<>(Arrays.asList("USA", "England",
                "France", "Germany", "Canada"));

    }

    public static ArrayList<String> getLocationList() {
        return locationList;
    }

    public void setLocationList(String schoolLocation) {
        ArrayList<String> listOfLocations = getLocationList();
        //schoolLocation = location;
        if (listOfLocations.contains(schoolLocation)) {
            location = schoolLocation;
        } else {
            throw new RuntimeException("Location should be one of the following " + listOfLocations);
        }

        SchoolLocation.locationList = getLocationList();
    }

    public void setPrice() {

        if (location.equalsIgnoreCase("USA")) {
            price = "$8000";
        } else if (location.equalsIgnoreCase("England")) {
            price = "$6500";
        } else if (location.equalsIgnoreCase("France")) {
            price = "$7200";
        } else if (location.equalsIgnoreCase("Germany")) {
            price = "$7000";
        } else if (location.equalsIgnoreCase("Canada")) {
            price = "$7500";
        } else {
            throw new RuntimeException("This is not a valid location");
        }

        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getLocation() {
        addLocation();
        return location;
    }
}

