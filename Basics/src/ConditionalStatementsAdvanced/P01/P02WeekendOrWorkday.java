package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P02WeekendOrWorkday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String inputDay=scanner.nextLine();
         String outputStatement="";
         switch(inputDay){
             case "Monday":
             case "Tuesday":
             case "Wednesday":
             case "Thursday":
             case "Friday":
                 outputStatement="Working day";
                 break;
             case "Saturday":
             case "Sunday":
                 outputStatement="Weekend";
                 break;
             default:
                 outputStatement="Error";
         }
        System.out.println(outputStatement);
    }
}
