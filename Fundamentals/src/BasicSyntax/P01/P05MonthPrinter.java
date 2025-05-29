package BasicSyntax.P01;

import java.util.Scanner;

public class P05MonthPrinter {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int month=Integer.parseInt(scr.nextLine());
        String print="" ;
        switch(month){
            case 1 -> print="January";
            case 2 -> print="February";
            case 3 -> print="March";
            case 4 -> print="April";
            case 5 -> print="May";
            case 6 -> print="June";
            case 7 -> print="July";
            case 8 -> print="August";
            case 9 -> print="September";
            case 10 -> print="October";
            case 11 -> print="November";
            case 12 -> print="December";
            default -> print="Error!";

        }

        System.out.println(print);
    }
}
