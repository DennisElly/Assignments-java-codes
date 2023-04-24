import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        password = password.toLowerCase().replace(' ', '$');
        System.out.println(password);
    }
}