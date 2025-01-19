package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFruit = scanner.nextLine();
        String inputDay = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        switch (inputDay) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (inputFruit) {
                    case "banana":
                        price = 2.50;
                        break;
                    case "apple":
                        price = 1.2;
                        break;
                    case "orange":
                        price = 0.85;
                        break;
                    case "grapefruit":
                        price =1.45;
                        break;
                    case "kiwi":
                        price = 2.70;
                        break;
                    case "pineapple":
                        price = 5.50;
                        break;
                    case "grapes":
                        price = 3.85;
                        break;

                    default:
                        System.out.println("error");
                        return;
                }

                break;
            case "Saturday":
            case "Sunday": switch (inputFruit) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price =1.60;
                    break;
                case "kiwi":
                    price = 3;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.2;
                    break;

                default:
                    System.out.println("error");
                    return;
            }

                break;
            default:
                System.out.println("error");
                return;
        }
        if (price != 0) {
            System.out.printf("%.2f",price * quantity);
        }

    }
}
