package ConditionalStatements.P01;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        if (firstNumber>secondNumber){
            System.out.println(firstNumber);
        } else {
            System.out.println(secondNumber);
        }
    }
}
