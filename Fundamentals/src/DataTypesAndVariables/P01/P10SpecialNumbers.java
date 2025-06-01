package DataTypesAndVariables.P01;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= inputNum; i++) {
            int sum = sumDigits(i);
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);

            } else {
                System.out.printf("%d -> False%n", i);
            }
        }


    }

    private static int sumDigits(int i) {
        int sum = 0;
        while (i > 0) {
            int currentDigit = i % 10;
            sum += currentDigit;
            i /= 10;
        }
        return sum;
    }
}
