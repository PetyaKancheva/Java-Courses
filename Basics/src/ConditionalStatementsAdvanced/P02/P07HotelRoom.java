package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String month= scanner.nextLine();
         int nights=Integer.parseInt(scanner.nextLine());
         double priceAppartment=0;
         double priceStudio=0;

         if(month.equals("May")||month.equals("October")){
             priceAppartment=65;

             if(nights<=7){
                 priceStudio=50;
             }else if(nights<=14){
                 priceStudio=50*0.95;
             }else{
                 priceStudio=50*0.70;
             }
         }else if(month.equals("June")|| month.equals("September")){
             priceAppartment=68.70 ;

             if(nights<=14){
                 priceStudio=75.20;
             }else {
                 priceStudio=75.20*0.8;
             }
         }else if(month.equals("July")|| month.equals("August")){
             priceAppartment=77;
             priceStudio=76;
         }

         if(nights>14){
             priceAppartment*=0.9;
         }

        System.out.printf("Apartment: %.2f lv.%n",priceAppartment*nights);
        System.out.printf("Studio: %.2f lv.",priceStudio*nights);


    }
}
