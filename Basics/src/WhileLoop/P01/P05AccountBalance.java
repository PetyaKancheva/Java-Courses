package WhileLoop.P01;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String input=scanner.nextLine();
         double totalMoney=0;
         while(!input.equals("NoMoreMoney")){
                double currentMoney=Double.parseDouble(input);
                if(currentMoney<0){
                    System.out.println("Invalid operation!");
                    break;
                }
             System.out.printf("Increase: %.2f%n",currentMoney);
             totalMoney+=currentMoney;
             input=scanner.nextLine();
         }

        System.out.printf("Total: %.2f",totalMoney);
    }
}
