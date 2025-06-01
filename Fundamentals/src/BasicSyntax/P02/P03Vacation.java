package BasicSyntax.P02;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double singlePrice = 0;
        double totalPrice = 0;
        if (groupType.equals("Students")) {
            switch (dayOfWeek) {
                case "Friday" -> singlePrice = 8.45;
                case "Saturday" -> singlePrice = 9.80;
                case "Sunday" -> singlePrice = 10.46;
            }
        } else if (groupType.equals("Business")) {
            switch (dayOfWeek) {
                case "Friday" -> singlePrice = 10.90;
                case "Saturday" -> singlePrice = 15.60;
                case "Sunday" -> singlePrice = 16;
            }
        } else if (groupType.equals("Regular")) {

            switch (dayOfWeek) {
                case "Friday" -> singlePrice = 15;
                case "Saturday" -> singlePrice = 20;
                case "Sunday" -> singlePrice = 22.50;
            }
        }
        if (groupType.equals("Students") && groupNumber >= 30) {
            totalPrice = singlePrice * groupNumber * 0.85;
        } else if (groupType.equals("Business") && groupNumber >= 100) {
            totalPrice = singlePrice * (groupNumber-10);
        } else if (groupType.equals("Regular") && groupNumber >= 10 && groupNumber<=20) {
            totalPrice = singlePrice * groupNumber * 0.95;
        } else {
            totalPrice = singlePrice * groupNumber;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
