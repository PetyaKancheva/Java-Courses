package ConditionalStatements.P02;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzlePrice=2.6;
        double dollPrice=3;
        double teddyBearPrice=4.1;
        double minionPrice=8.2;
        double truckPrice=2;

        double excursionPrice=Double.parseDouble(scanner.nextLine());
       int puzzleCount=Integer.parseInt(scanner.nextLine());
       int dollCount=Integer.parseInt(scanner.nextLine());
       int teddyBearCount=Integer.parseInt(scanner.nextLine());
       int minionCount=Integer.parseInt(scanner.nextLine());
       int truckCount=Integer.parseInt(scanner.nextLine());

       double sum=0;
        sum=puzzleCount*puzzlePrice +dollCount*dollPrice +teddyBearCount*teddyBearPrice + minionCount* minionPrice + truckCount*truckPrice;

               int totalCount=puzzleCount+dollCount+teddyBearCount+minionCount+truckCount;
               if (totalCount>=50){
                   sum*=0.75;
               }
        sum*=0.9; //rent

       double result= sum-excursionPrice;

       if (result<0){
           System.out.printf("Not enough money! %.2f lv needed.",Math.abs(result));
       }else{
           System.out.printf("Yes! %.2f lv left.",result);
       }
    }
}
