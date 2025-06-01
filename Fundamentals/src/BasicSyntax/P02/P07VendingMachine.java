package BasicSyntax.P02;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double money = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                money += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            String product = input;
            double price = 0;
            switch (product) {
                case "Nuts" -> price = 2;
                case "Water" -> price = 0.7;
                case "Crisps" -> price = 1.5;
                case "Soda" -> price = 0.8;
                case "Coke" -> price = 1.0;
                default ->{
                    System.out.println("Invalid product");
                    input = scanner.nextLine();
                    continue;
                }
            }

            if(money - price >= 0) {
                System.out.printf("Purchased %s%n", product);
                money -= price;
            } else {
                System.out.println("Sorry, not enough money");
            }

            input = scanner.nextLine();
        }


        System.out.printf("Change: %.2f", money);
    }
}
