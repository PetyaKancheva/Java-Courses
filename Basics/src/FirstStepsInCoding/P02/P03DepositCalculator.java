package FirstStepsInCoding.P02;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   double deposit=Double.parseDouble(scanner.nextLine());
   int depositTimeFrame =Integer.parseInt(scanner.nextLine());
   double yearlyRate=Double.parseDouble(scanner.nextLine())/100;

        double sum = deposit + depositTimeFrame*((deposit*yearlyRate)/12);
        System.out.println(sum);


    }
}
