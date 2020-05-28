package moreAboutJava.findYourShoes;

public class Walking extends Shoe {
    public final boolean goreTex;

    public Walking(boolean goreTex, String brand, double size) {
        super(brand, size);
        this.goreTex = goreTex;
    }

    public static void main(String[] args) {
        Shoe shoe1 = new Shoe("Nike", 8.5);
    }

    @Override
    public String toString() {
        return "goreTex= " + goreTex +
                " brand= " + brand +
                " size= " + size;
    }
}
