import java.util.Scanner;

public class LoginPage {
    private static final String USERNAME = "gnaneswar";
    private static final String PASSWORD = "gnana@123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(USERNAME) && enteredPassword.equals(PASSWORD)) {
            System.out.println("Signup successful! You can now use the provided credentials for login.");
        } else {
            System.out.println("Error: Username already taken. Please choose a different username.");
        }
    }
}
