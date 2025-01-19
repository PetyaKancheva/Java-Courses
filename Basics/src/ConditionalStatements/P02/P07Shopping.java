package ConditionalStatements.P02;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int qtyVideoCard = Integer.parseInt(scanner.nextLine());
        int qtyCPU = Integer.parseInt(scanner.nextLine());
        int qtyRAM = Integer.parseInt(scanner.nextLine());

        double priceVideoCard = 250;
        double totalVideoCardPrice = priceVideoCard * qtyVideoCard;
        double priceCPu = totalVideoCardPrice * 0.35;
        double priceRAM = totalVideoCardPrice * 0.1;
        double totalPrice = totalVideoCardPrice + priceCPu * qtyCPU + priceRAM * qtyRAM;
        if (qtyVideoCard > qtyCPU) {
            totalPrice *= 0.85;
        }
        double result= budget -totalPrice  ;
        if (result <0) {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(result));
        } else {
            System.out.printf("You have %.2f leva left!",result);
        }
    }
}
