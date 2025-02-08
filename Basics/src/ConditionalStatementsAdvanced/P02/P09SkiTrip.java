package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nights=Integer.parseInt(scanner.nextLine())-1; // 2 days is 1 night
        String accomodationType= scanner.nextLine();
        String review= scanner.nextLine();
        double totalPrice=0;
        double discount=0;

       if(accomodationType.equals("room for one person")){
        totalPrice=18*nights;
       }else if (accomodationType.equals("apartment")){
           totalPrice=25*nights;
         if(nights<9){
             discount=0.3;
         }else if(nights<=14){
             discount=0.35;
         }else if(nights>14){
             discount=0.5;
           }
       }else if (accomodationType.equals("president apartment")){
           totalPrice=35*nights;
           if(nights<9){
               discount=0.1;
           }else if(nights<=14){
               discount=0.15;
           }else if(nights>14){
               discount=0.2;
           }
       }
        totalPrice*=(1-discount);
       if(review.equals("positive")){
           totalPrice*=1.25;
       }else{
           totalPrice*=0.9;
       }



        System.out.printf("%.2f",totalPrice);

    }
}
