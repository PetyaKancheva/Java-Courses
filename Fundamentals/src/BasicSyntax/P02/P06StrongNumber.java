package BasicSyntax.P02;

import java.math.BigDecimal;
import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        int initialNum = inputNum;
        int sum = 0;
        while (inputNum > 0) {
            int currentDigit = inputNum % 10;
            int factorial = getFactoriel(currentDigit);
            sum += factorial;
            inputNum /= 10;
        }

        if (initialNum == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");

        }
    }

    private static int getFactoriel(int currentDigit) {
        int factoriel = 1;
             for (int i = 2; i<=currentDigit; i++) {
                 factoriel = factoriel * i;
        }


        return factoriel;
    }
}
