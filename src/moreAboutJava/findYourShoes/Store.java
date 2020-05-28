package moreAboutJava.findYourShoes;

public class Store {

    public static void main(String[] args) {
        Walking walkingShoe = new Walking(true, "Nike", 8.5);
        System.out.println(walkingShoe.toString());
        Running runningShoe = new Running(250, "Nike", 43);
        System.out.println(runningShoe.toString());


    }

}
