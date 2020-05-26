package Replit.encapsulation.en3;

public class Subscribe {
    private String name, whichTypeOfMember;
    private int memberCount, price;

    public void setName(String name) {
        this.name = name;
    }

    public void setWhichTypeOfMember(String whichTypeOfMember) {

        if (whichTypeOfMember.equalsIgnoreCase("Gold")) {
            System.out.println("Welcome to membership " + name + ". Your membership is " + memberCount * 50 + " dollar for month you can enjoy the videos , all homework and see you soon.");
        }
        if (whichTypeOfMember.equalsIgnoreCase("Silver")) {
            System.out.println("Welcome to membership " + name + ". Your membership is " + memberCount * 40 + " dollar for month you can enjoy the videos.");
        }
        if (whichTypeOfMember.equalsIgnoreCase("Bronze")) {
            System.out.println("Welcome to membership " + name + ". Your membership is " + memberCount * 30 + " dollar for month you can enjoy and all homework.");
        }


        this.whichTypeOfMember = whichTypeOfMember;
    }

    public void setMemberCount(int memberCount) {

        this.memberCount = memberCount;
    }

    public int getPrice() {

        memberCount = price;

        return price;
    }

    public String toString() {
        return "";
    }
}
