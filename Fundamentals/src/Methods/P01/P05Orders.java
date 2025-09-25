package Methods.P01;

import java.util.Scanner;

public class P05Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String product=scanner.nextLine();
            int quantity=Integer.parseInt(scanner.nextLine());


        System.out.printf( "%.2f", calculateOrder(product,quantity));
    }

    private static double calculateOrder(String product, int quantity) {
                double price=0;

            switch (product){
                case "coffee": price=1.50; break;
                case "water": price=1.00; break;
                case "coke": price=1.40; break;
                case "snacks": price=2.00; break;
            }
        return price*quantity;
    }

}
