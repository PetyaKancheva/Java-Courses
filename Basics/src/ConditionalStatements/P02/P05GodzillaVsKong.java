package ConditionalStatements.P02;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countActors = Integer.parseInt(scanner.nextLine());
        double clothingPricePerActor = Double.parseDouble(scanner.nextLine());


        double decour = budget * 0.1;
        double totalClothingPrice = countActors * clothingPricePerActor;
        if (countActors > 150) {
            totalClothingPrice *= 0.9;
        }
        double totalCost = decour + totalClothingPrice;
        double saldo = budget - totalCost;

        if (saldo < 0) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(saldo));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", saldo            );
        }
    }

}
