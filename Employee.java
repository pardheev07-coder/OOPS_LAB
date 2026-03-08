class Employee {
String name;
double salary;
void setEmployee(String n, double s) {
name = n;
salary = s;
}
void displayEmployee() {
System.out.println("Name: " + name);
System.out.println("Salary: " + salary);
}
}
class Manager extends Employee {
int teamSize;
void setManager(int t) {
teamSize = t;
}
void displayManager() {
System.out.println("Team Size: " + teamSize);
}
}
class ProjectManager extends Manager {
String projectName;
void setProject(String p) {
projectName = p;
}
void displayProject() {
System.out.println("Project Name: " + projectName);
}
}
public class Main {
public static void main(String[] args) {
ProjectManager pm = new ProjectManager();
pm.setEmployee("Ravi", 60000);
pm.setManager(10);
pm.setProject("Banking App");
System.out.println("---- Project Manager Details ----");
pm.displayEmployee();
pm.displayManager();
pm.displayProject();
}
}
