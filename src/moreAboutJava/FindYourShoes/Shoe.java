package moreAboutJava.FindYourShoes;

public class Shoe {

    public final String brand;
    public final double size;

    public Shoe(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return
                "\nbrand= " + brand +
                        "\nsize= " + size;
    }
}
