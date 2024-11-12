package FirstStepsInCoding.P01;

import java.util.Scanner;

public class P09_Yard_Greening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardSize =Double.parseDouble(scanner.nextLine());
        double greeningFeePerSqrM=7.61;
        double priceBeforeDiscount=yardSize*greeningFeePerSqrM;
        double discount=0.18;
        double discountedPrice=priceBeforeDiscount*discount;
         double finalPrice=priceBeforeDiscount-discountedPrice;
        System.out.printf("The final price is: %.2f lv.%n",finalPrice);
        System.out.printf("The discount is: %.2f lv.", discountedPrice);

    }
}
