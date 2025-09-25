package Methods.P01;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = calculate(width, length);
        System.out.println(area);
    }

    private static int calculate(int width, int length) {
        return width * length;
    }
}
