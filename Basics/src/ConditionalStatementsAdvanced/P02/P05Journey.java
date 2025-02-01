package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String season= scanner.nextLine();

        String destination="";
        String lodging="";
        double cost=0;

        if(budget<=100){
            destination="Bulgaria";
            if(season.equals("summer")){
                cost=budget*0.3;
                lodging="Camp";
            }else if(season.equals("winter")){
                cost=budget*0.7;
                lodging="Hotel";
            }
        }else if(budget<=1000){
            destination="Balkans";
            if(season.equals("summer")){
                cost=budget*0.4;
                lodging="Camp";
            }else if(season.equals("winter")){
                cost=budget*0.8;
                lodging="Hotel";
            }
        }else{
            destination="Europe";
            cost=0.9*budget;
            lodging="Hotel";
        }

        System.out.printf( "Somewhere in %s%n",destination );
        System.out.printf("%s - %.2f",lodging,cost );


    }
}
