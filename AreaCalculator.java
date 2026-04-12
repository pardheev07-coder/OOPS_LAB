class AreaCalculator {

    // Circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Rectangle
    int area(int length, int breadth) {
        return length * breadth;
    }

    // Triangle
    double area(double base, double height, String type) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();

        System.out.println("Circle Area: " + a.area(5.0));
        System.out.println("Rectangle Area: " + a.area(7, 8));
        System.out.println("Triangle Area: " + a.area(7.0, 8.0, "triangle"));
    }
}