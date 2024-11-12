package FirstStepsInCoding.P01;

import java.util.Scanner;

public class P08_Pet_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int dogsCount=Integer.parseInt(scanner.nextLine());
         int animalsCount=Integer.parseInt(scanner.nextLine());
         double priceDogFood= 2.5;
         double priceAnimalFood= 4;

         double petFoodCost=dogsCount*priceDogFood + animalsCount*priceAnimalFood;

        System.out.println(petFoodCost + " lv.");

    }
}
