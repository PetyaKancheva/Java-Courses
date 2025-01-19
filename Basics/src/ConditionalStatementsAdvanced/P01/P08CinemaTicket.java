package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDay=scanner.nextLine();
        double price=0;
        switch (inputDay){
            case "Monday":
            case "Tuesday":
            case "Friday":
                price=12;
                break;
            case "Wednesday":
            case "Thursday":
            price=14;
            break;
            case "Saturday":
            case "Sunday":
                price=16;
            break;
        }
        System.out.printf("%.0f",price);

    }
}
