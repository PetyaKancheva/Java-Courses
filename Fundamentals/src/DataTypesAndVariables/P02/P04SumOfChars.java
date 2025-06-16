package DataTypesAndVariables.P02;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countChars = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= countChars; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            sum += currentChar;
        }

        System.out.println("The sum equals: "+sum);


    }
}
