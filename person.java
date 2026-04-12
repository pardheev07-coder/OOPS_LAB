class Person {
    String name = "John";
}

class Student extends Person {
    int roll = 101;
    void display() {
        System.out.println(name + " " + roll);
    }
}

public class person {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}