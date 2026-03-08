class Employee {
String name;
int id;
double salary;
Employee(String name, int id, double salary) {
this.name = name;
this.id = id;
this.salary = salary;
}
void displayEmployee() {
System.out.println("Name: " + name);
System.out.println("ID:" + id);
System.out.println("Salary:" + salary);
}
}
class Manager extends Employee {
double bonus;
Manager(String name, int id, double salary, double bonus) {
super(name, id, salary);
this.bonus = bonus;
}
double calculateTotalSalary() {
return salary + bonus;
}
void displayManager() {
displayEmployee();
System.out.println("Bonus:" + bonus);
System.out.println("Total Salary:" + calculateTotalSalary());
}
}
public class pardheev {
public static void main(String[] args) {
Manager m = new Manager("pardheev", 207, 20000, 100000);
m.displayManager();
}
}