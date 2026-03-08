class User {
String name;
String email;
User(String name, String email) {
this.name = name;
this.email = email;
}
void displayUser() {
System.out.println("Name: " + name);
System.out.println("Email: " + email);
}
}
class Buyer extends User {
Buyer(String name, String email) {
super(name, email);
}
void buyProduct(String product, double price) {
System.out.println(name + " bought " + product + " for " + price);
}
}
class Seller extends User {
Seller(String name, String email) {
super(name, email);
}
void sellProduct(String product, double price) {
System.out.println(name + " sold " + product + " for " + price);
}
}
public class user {
public static void main(String[] args) {
Buyer b = new Buyer("pardheev", "pardheev0056@gmail.com");
Seller s = new Seller("angel", "angel@gmail.com");
System.out.println("Buyer Details:");
b.displayUser();
b.buyProduct("phone", 170000);
System.out.println("Seller Details:");
s.displayUser();
s.sellProduct("tab", 50000);
}
}