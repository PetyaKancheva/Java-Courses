package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product=scanner.nextLine();
        String city=scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());
        double price=0;
        switch (city){
            case"Sofia":
                switch(product) {
                    case "coffee":
                        price=0.5;
                        break;
                      case "water":
                          price=0.8;
                        break;
                    case "beer":
                        price=1.20;
                        break;
                    case "sweets":
                        price=1.45;
                        break;
                    case "peanuts":
                        price=1.60;
                        break;
                }
                break;
            case "Plovdiv":
                switch(product) {
                    case "coffee":
                        price=0.4;
                        break;
                    case "water":
                        price=0.7;
                        break;
                    case "beer":
                        price=1.15;
                        break;
                    case "sweets":
                        price=1.30;
                        break;
                    case "peanuts":
                        price=1.50;
                        break;
                }
            break;
            case"Varna":
                switch(product) {
                    case "coffee":
                        price=0.45;
                        break;
                    case "water":
                        price=0.7;
                        break;
                    case "beer":
                        price=1.10;
                        break;
                    case "sweets":
                        price=1.35;
                        break;
                    case "peanuts":
                        price=1.55;
                        break;
                }
                break;

        }


        System.out.println(price*quantity);

    }
}
