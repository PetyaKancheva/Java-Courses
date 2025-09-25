package Methods.P01;

import java.util.Scanner;


public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int b = Integer.parseInt(scanner.nextLine());

        double result = calculate(a, b, operator);
        System.out.printf("%.2f",result);
    }

    private static double calculate(int a, int b, String operator) {
        double result=0;
        switch (operator) {
            case "+": result= a + b; break;
            case "-": result=  a-b; break;
            case "/":   result=  a*0.0 / b; break;
            case "*":  result=  a * b; break;
        }
        return  result;
    }
}
