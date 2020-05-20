import java.util.Scanner;

class Family {


    int totalUser, totalAmount;
    String familyName, familyPrimaryUser;

    public int getTotalAmount(PhonePlan planType, PhonePlan priceForEach) {
        PhonePlan plan = new PhonePlan();
        return totalAmount = plan.amount(totalUser) * totalUser;
    }

//    @Override
//    public String toString() {
//        return "total Amount is : " + totalAmount +
//                "name is : " + familyName +
//                "user is : " + familyPrimaryUser;
//    }

}

class PhonePlan {

    String planType;
    int priceForEach;

    public int amount(int totalUser) {
        Family users = new Family();
        totalUser = users.totalUser;

        if (planType.equals("eco") && totalUser <= 3) {
            priceForEach = 50;
        } else if (planType.equals("eco") && totalUser > 3 && totalUser <= 5) {
            priceForEach = 45;
        } else if (planType.equals("eco") && totalUser > 5) {
            priceForEach = 35;
        } else if (planType.equals("premium") && totalUser <= 3) {
            priceForEach = 70;
        } else if (planType.equals("premium") && totalUser > 3 && totalUser <= 5) {
            priceForEach = 60;
        } else if (planType.equals("premium") && totalUser > 5) {
            priceForEach = 55;
        }

        return priceForEach;
    }


}

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Amount of User");
        int amountOfUser = input.nextInt();
        System.out.println("Family Name");
        String familyName = input.nextLine();
        System.out.println("Family Primary User");
        String familyPrimaryUser = input.nextLine();
        System.out.println("Plan Type");
        String planType = input.nextLine();

        Family f1 = new Family();
        f1.familyName = familyName;
        f1.familyPrimaryUser = familyPrimaryUser;
        f1.totalUser = amountOfUser;
        System.out.println(f1);

    }

}