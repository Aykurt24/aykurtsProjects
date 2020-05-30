package saturdayProject8.Mortgage;

public class Users {

    private String username, whichCondition, houseType;
    private int roomCount, donwPayment, longTerm;
    private StatesTax statesTax;


    public Users(String username, String whichCondition, String houseType, int roomCount, int donwPayment, int longTerm, StatesTax stateTax) {
        this.username = username;
        this.whichCondition = whichCondition;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.donwPayment = donwPayment;
        this.longTerm = longTerm;
        this.statesTax = stateTax;
    }

    public String getUsername() {
        return username;
    }

    public String getWhichCondition() {
        return whichCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDonwPayment() {
        return donwPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public StatesTax getStateTax() {
        return statesTax;
    }


  /*
            Create private following variables
            String username
            String WhichCondition
            String houseType
            int roomCount
            int downPayment
            int longTerm
            StatesTax statesTax;
        Create a constructor  using all the variables.
         */


    /*
    Create the read-only method of the all variables
     */


}

