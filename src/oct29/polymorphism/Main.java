package oct29.polymorphism;

public class Main {
    public static void main(String[] args) {


        // Upcasting : Parent ref can be assigned to child class object
        Shape shape = new Rectangle(10,23);  // Runtime polymorphism

        System.out.println(shape.getArea());


        /*Shape shape = new Shape();
        System.out.println(shape.getArea());

        Rectangle rectangle = new Rectangle(10, 12);
        System.out.println(rectangle.getArea());*/


    }
}
