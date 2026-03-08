abstract class Shape {
abstract void area();
}
class Circle extends Shape {
double r = 6;
void area() {
double result = 3.14 * r * r;
System.out.println("Area of Circle = " + result);
}
}
class Rectangle extends Shape {
int length = 7, breadth = 8;
void area() {
int result = length * breadth;
System.out.println("Area of Rectangle = " + result);
}
}
public class main2 {
public static void main(String[] args) {
Shape[] shapes = new Shape[2];
shapes[0] = new Circle();
shapes[1] = new Rectangle();
for (Shape s : shapes) {
s.area();
}
}
}