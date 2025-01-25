package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeFlower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double pricePerFlower = 0;

        switch (typeFlower) {
            case "Roses" -> pricePerFlower = 5;
            case "Dahlias" -> pricePerFlower = 3.8;
            case "Tulips" -> pricePerFlower = 2.8;
            case "Narcissus" -> pricePerFlower = 3;
            case "Gladiolus" -> pricePerFlower = 2.5;
        }

        double totalSum = pricePerFlower*count;
        double bulkAdjustment=1;
        if(typeFlower.equals("Roses")&& count>80){
            bulkAdjustment=1-0.1;
        }
        if(typeFlower.equals("Dahlias")&& count>90){
            bulkAdjustment=1-0.15;
        }
        if(typeFlower.equals("Tulips")&& count>80){
            bulkAdjustment=1-0.15;
        }
        if(typeFlower.equals("Narcissus")&& count<120){
            bulkAdjustment=1+0.15;
        }
        if(typeFlower.equals("Gladiolus")&& count<80){
            bulkAdjustment=1+0.20;
        }

        totalSum*=bulkAdjustment;
        if(budget-totalSum>=0){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,typeFlower,(budget-totalSum));
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(budget-totalSum));
        }


    }
}
