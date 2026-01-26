import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Input marks using for loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / (double) n;
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        // Grade calculation
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " Grade: ");
            if (marks[i] >= 90)
                System.out.println("A");
            else if (marks[i] >= 75)
                System.out.println("B");
            else if (marks[i] >= 50)
                System.out.println("C");
            else
                System.out.println("Fail");
        }

        sc.close();
    }
}
