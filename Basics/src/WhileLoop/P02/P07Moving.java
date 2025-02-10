package WhileLoop.P02;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int size = width * length*height;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int inputInt = Integer.parseInt(input);
            size -= inputInt;
            if (size <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (size > 0) {
            System.out.printf("%d Cubic meters left.", size);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(size));
        }
    }
}
