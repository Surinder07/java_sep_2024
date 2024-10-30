package oct29.polymorphism;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public double getArea() {
        return length * width;
    }
}

// Lombok ...
