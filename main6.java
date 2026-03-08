class Vehicle {
String brand;
int speed;
Vehicle(String brand, int speed) {
this.brand = brand;
this.speed = speed;
}
void displayDetails() {
System.out.println("Brand: " + brand);
System.out.println("Speed: " + speed + " km/h");
}
}
class Car extends Vehicle {
String fuelType;
Car(String brand, int speed, String fuelType) {
super(brand, speed);
this.fuelType = fuelType;
}
void displayDetails() {
super.displayDetails();
System.out.println("Fuel Type: " + fuelType);
}
}
class SportsCar extends Car {
double accelerationTime;
SportsCar(String brand, int speed, String fuelType, double accelerationTime) {
super(brand, speed, fuelType);
this.accelerationTime = accelerationTime;
}
void displayDetails() {
super.displayDetails();
System.out.println("Acceleration Time (0-200 km/h): " + accelerationTime + " seconds");
}
}
public class main6 {
public static void main(String[] args) {
SportsCar sc = new SportsCar("lamborghini", 400, "diesel", 2.4);
sc.displayDetails();
}
}