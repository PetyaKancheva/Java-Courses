package DataTypesAndVariables.P01;

import java.util.Scanner;

public class P01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters=Integer.parseInt(scanner.nextLine());
        double km=meters*1.0/1000;
        System.out.printf("%.2f",km);
    }
}
