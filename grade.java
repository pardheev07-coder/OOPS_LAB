import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        System.out.print("Enter your marks: ");
        Scanner scanner=new Scanner(System.in);
        int marks=scanner.nextInt();
        if (marks>=90){
            System.out.println("GradeA");
        }
        else if (marks>=75){
            System.out.println("GradeB");
        }
        else if (marks>=60){
            System.out.println("GradeC");
        }
        else if (marks>=40){
            System.out.println("GradeD");
        }
        else{
             System.out.println("Fail");
        }
      scanner.close();
    }
}