package JavaTechnoStudy.day51.task1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {

    private final List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }
//
//        public double getTotalPrice() {
//            double sum = 0;
//            for(Product product : productList) {
//                sum += product.getPrice();
//            }
//
//            return sum;
//        }

    public double getTotalPrice() {
        double sum = 0;
        for (Product device : productList) {
            //1. way downcast device to AbstractDevice
            // AbstractDevice absDev = (AbstractDevice) device;
            // absDev.getPrice();

            //2. way downcast device in default method, so that you dont have to implement it in derived classes
            // device.getPrice();

            //3. way implement getPrice method in derived class
            sum += device.getPrice();
        }

        return sum;
    }

    //check if money is enough to buy
    public void checkOut(double money) {
        if (money < getTotalPrice()) {
            throw new MoneyNotEnoughException("Not enough money");
        }

        System.out.println("Thank you for purchase, see you soon :) ");
    }


    public void printReceipt() {
        System.out.println("--- Receipt ---");
        for (Product product : productList) {
            System.out.println(product.getModel() + ":  $" + product.getPrice());
        }
        System.out.println("---------------");
        System.out.println("TOTAL: $" + getTotalPrice());
        System.out.println("---------------");
    }
}
