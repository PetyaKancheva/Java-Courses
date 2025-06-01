package BasicSyntax.P02;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = "";
        int wrongPasswordCount = 0;
        for (int i = 0; i < username.length(); i++) {
            password = username.charAt(i) + password;
        }
        String input = scanner.nextLine();
        while (input != null) {
            if (input.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {

                wrongPasswordCount++;
                if (wrongPasswordCount == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                }
            }
            input = scanner.nextLine();
        }


    }
}
