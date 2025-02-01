package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget=Integer.parseInt(scanner.nextLine());
        String season=scanner.nextLine();
        int countFishermen=Integer.parseInt(scanner.nextLine());
        double boatRent=0;
        if (season.equals("Spring")){
            boatRent=3000;
        }else if(season.equals("Summer") ||season.equals("Autumn")){
            boatRent=4200;
        }else if ( season.equals("Winter")){
            boatRent=2600;
        }

        if(countFishermen<=6){
            boatRent*=0.9;
        }else if(countFishermen<=11){
            boatRent*=0.85;
        }else {
            boatRent*=0.75;
        }

        if( (countFishermen %2==0) && !season.equals("Autumn")){
            boatRent*=0.95;
        }
        if(budget-boatRent>=0){
            System.out.printf("Yes! You have %.2f leva left.",budget-boatRent);
        }else {
            System.out.printf(  "Not enough money! You need %.2f leva.",Math.abs(budget-boatRent));
        }

    }
}
