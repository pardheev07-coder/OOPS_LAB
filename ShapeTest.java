class Shape {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area: " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area: " + (5 * 4));
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Triangle Area: " + (0.5 * 5 * 4));
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();

        s = new Triangle();
        s.area();
    }
}