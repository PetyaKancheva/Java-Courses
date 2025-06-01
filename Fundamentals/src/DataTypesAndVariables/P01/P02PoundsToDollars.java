package DataTypesAndVariables.P01;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
//        1 British Pound = 1.36 Dollars
        Scanner scanner = new Scanner(System.in);
         double pound = Double.parseDouble(scanner.nextLine());
         double dollar=pound*1.36;
        System.out.printf("%.3f",dollar);
    }
}
