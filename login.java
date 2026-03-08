import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;
        int attempts = 0;

        do {
            System.out.print("Enter Password: ");
            password = sc.nextLine();
            attempts++;

            if (password.equals("pardheev@07")) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Incorrect Password");
            }

        } while (attempts < 3);

        if (attempts == 3) {
            System.out.println("Account Locked. Too many attempts!");
        }

        sc.close();
    }
    
    }