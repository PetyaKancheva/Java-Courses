package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String inputCity=scanner.nextLine();
         double inputSales= Double.parseDouble(scanner.nextLine());
         double commission=0;
         if(inputCity.equals("Sofia")){
             if(inputSales>10000){
                 commission=0.12;
             }else if(inputSales>1000){
                 commission=0.08;
             }else if(inputSales>500){
             commission=0.07;
         }else if(inputSales>=0){
                 commission=0.05;
             }

         }else if(inputCity.equals("Varna")){
             if(inputSales>10000){
                 commission=0.13;
             }else if(inputSales>1000){
                 commission=0.10;
             }else if(inputSales>500){
                 commission=0.075;
             }else if(inputSales>=0){
                 commission=0.045;
             }

         }else if(inputCity.equals("Plovdiv")){
             if(inputSales>10000){
                 commission=0.145;
             }else if(inputSales>1000){
                 commission=0.12;
             }else if(inputSales>500){
                 commission=0.08;
             }else if(inputSales>=0){
                 commission=0.055;
             }
    }
         if(commission!=0){
            System.out.printf("%.2f",commission*inputSales);
        }else{
             System.out.println("error");
         }
    }
}
