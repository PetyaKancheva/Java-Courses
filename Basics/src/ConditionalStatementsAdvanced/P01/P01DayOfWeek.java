package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberInput = Integer.parseInt(scanner.nextLine());
        String dayToPrint = "";
        switch (numberInput) {
            case 1:
                dayToPrint = "Monday";
                break;
            case 2:
                dayToPrint = "Tuesday";
                break;
            case 3:
                dayToPrint = "Wednesday";
                break;
            case 4:
                dayToPrint = "Thursday";
                break;
            case 5:
                dayToPrint = "Friday";
                break;
            case 6:
                dayToPrint = "Saturday";
                break;
            case 7:
                dayToPrint = "Sunday";
                break;
            default:
                dayToPrint = "Error";

        }

        System.out.println(dayToPrint);
    }

}
