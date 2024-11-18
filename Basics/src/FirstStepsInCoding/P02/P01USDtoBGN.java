package FirstStepsInCoding.P02;

import java.util.Scanner;

public class P01USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdMoney=Double.parseDouble(scanner.nextLine());
        double conversionRate=1.79549;
        double  bgnMoney=usdMoney*conversionRate;
        System.out.println(bgnMoney);

    }
}
