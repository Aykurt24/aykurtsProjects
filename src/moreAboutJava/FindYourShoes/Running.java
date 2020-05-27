package moreAboutJava.FindYourShoes;

public class Running extends Shoe {
    public final double weight;

    public Running(double weight, String brand, double size) {
        super(brand, size);
        this.weight = weight;
    }

    public static void main(String[] args) {
        Shoe shoe2 = new Shoe("Adidas", 7.5);
    }

    @Override
    public String toString() {
        return "weight= " + weight +
                " brand= " + brand +
                " size= " + size;
    }
}
