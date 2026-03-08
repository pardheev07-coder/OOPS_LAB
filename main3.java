class Shape {
void area() {
System.out.println("Area of Shape");
}
}
class Circle extends Shape {
double r=7;
void area() {
double result=3.14*r*r;
System.out.println("Area of Circle: " + result);
}
}
class Rectangle extends Shape {
int length=7,breadth=2;
void area() {
int result=length*breadth;
System.out.println("Area of Rectangle: " + result);
}
}
class Triangle extends Shape {
int b=7,h=8;
void area() {
double result=0.5*b*h;
System.out.println("Area of Triangle: " + result);
}
}
public class main3 {
public static void main(String[] args) {
Shape s;
s = new Circle();
s.area();
s= new Rectangle();
s.area();
s = new Triangle();
s.area();
}
}