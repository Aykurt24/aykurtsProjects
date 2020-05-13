package JavaTechnoStudy.day30.example.example3;

public class Rectangle {         // class name is Rectangle
    int length;                 // instance
    int width;                 // instance

    public Rectangle(int length, int width) {     // this is our constructor
        this.length = length;
        this.width = width;
    }

    public int getArea() {         // this is our method
        return length * width;
    }
}
