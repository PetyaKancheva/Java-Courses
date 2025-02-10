package WhileLoop.P02;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int size = width * length;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int inputInt = Integer.parseInt(input);
            size -= inputInt;
            if (size <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (size > 0) {
            System.out.printf("%d pieces are left.", size);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(size));
        }
    }
}
