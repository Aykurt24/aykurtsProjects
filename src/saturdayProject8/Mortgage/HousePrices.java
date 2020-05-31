package saturdayProject8.Mortgage;

public class HousePrices extends Users {


    private int price;

    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int donwPayment, int longTerm, StatesTax stateTax) {
        super(username, whichCondition, houseType, roomCount, donwPayment, longTerm, stateTax);
    }

    public void roomCountToPrice() {
        if (getRoomCount() == 0) {
            price += 10000;
        } else if (getRoomCount() == 1) {
            price += 20000;
        } else if (getRoomCount() == 2) {
            price += 30000;
        } else if (getRoomCount() == 3) {
            price += 40000;
        } else if (getRoomCount() == 4) {
            price += 50000;
        } else if (getRoomCount() == 5) {
            price += 60000;
        }
    }

    public void ConditionToPrice() {
        if (getWhichCondition().equalsIgnoreCase("new")) {
            price += 50000;
        } else if (getWhichCondition().equalsIgnoreCase("like new")) {
            price += 40000;
        } else if (getWhichCondition().equalsIgnoreCase("old")) {
            price += 30000;
        } else if (getWhichCondition().equalsIgnoreCase("Renew Required")) {
            price += 15000;
        }

    }

    public void houseTypeToPrice() {
        if (getHouseType().equalsIgnoreCase("Apartment")) {
            price += 20000;
        } else if (getHouseType().equalsIgnoreCase("condo")) {
            price += 30000;
        } else if (getHouseType().equalsIgnoreCase("house")) {
            price += 40000;
        }
    }

    public int getPriceTotal() {
        houseTypeToPrice();
        ConditionToPrice();
        roomCountToPrice();
        StatesTax st = getStateTax();
        price = ((price * st.getTax()) / 100) + price;

        return price;


    }

    public int getPriceEachMonth() {
        int down = getDonwPayment();
        int term = getLongTerm();

        return (price - down) / term;
    }




   /*
            This class is extending the Users class
            1 private int variable price
     */




    /*
        Create a method name is roomCountToPrice
        no parameter
        no return type
        if the roomCount in the Users class equal to 0
            add 10000 to price
        if the roomCount in the Users class equal to 1
            add 20000 to price
        if the roomCount in the Users class equal to 2
            add 30000 to price
        if the roomCount in the Users class equal to 3
            add 40000 to price
        if the roomCount in the Users class equal to 4
            add 50000 to price
        if the roomCount in the Users class equal to 5
            add 60000 to price
     */


    /*
        Create a method name is ConditionToPrice
        no parameter
        no return type
            if WhichCondition variable in the Users class equal to new
                add 50000 to price
            if WhichCondition variable in the Users class equal to like new
                add 40000 to price
            if WhichCondition variable in the Users class equal to old
                add 30000 to price
            if WhichCondition variable in the Users class equal to Renew Required
                add 15000 to price
     */




    /*
        Create a method name is houseTypeToPrice
        no parameter
        no return type
            if HouseType is equal to Apartment
                add 20000 to price
            if HouseType is equal to condo
                add 30000 to price
            if HouseType is equal to house
                add 40000 to price
     */




    /*
            Create a method name is getPriceTotal
            return type is int
            Return the total price(housetype, condition and roomcount prices)
            Also you need to calculate the tax and add  to the price
            For the tax percentage use the StatesTax enum
     */




    /*
        Create a method name is getPriceEachMonth
            Return the monthly payment amount.
            reduce the downpayment and calculate the each month's payment
     */


}
