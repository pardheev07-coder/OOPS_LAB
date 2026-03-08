import java.util.ArrayList;
class Room {
double getRate() {
return 0;
}
}
class DeluxeRoom extends Room {
double getRate() {
return 3000; // per day rate
}
}
class StandardRoom extends Room {
double getRate() {
return 1500; // per day rate
}
}
public class main {
public static void main(String[] args) {
ArrayList<Room> rooms = new ArrayList<>();
rooms.add(new DeluxeRoom());
rooms.add(new StandardRoom());
rooms.add(new DeluxeRoom());
double totalCost = 0;
for (Room r : rooms) {
totalCost += r.getRate();
}
System.out.println("Total Booking Cost = " + totalCost);
}
}