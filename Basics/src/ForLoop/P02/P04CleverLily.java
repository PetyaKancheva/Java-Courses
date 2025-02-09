package ForLoop.P02;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int age = Integer.parseInt(scanner.nextLine());
            double priceWashingMachine=Double.parseDouble(scanner.nextLine());
            int priceToy=Integer.parseInt(scanner.nextLine());
            int countToy=0;
            int countMoney=0;
            double savings=0;

        for (int i = 1; i <=age ; i++) {
            if(i%2==0){
                countMoney++;
                double newMoney=countMoney*10;
                savings+=newMoney;
            }else{
                countToy++;
            }
        }

        savings-=countMoney;
        double totalMoney=countToy*priceToy +savings;
    if(totalMoney-priceWashingMachine>=0){
        System.out.printf("Yes! %.2f",totalMoney-priceWashingMachine);
    }else{
        System.out.printf("No! %.2f",Math.abs(totalMoney-priceWashingMachine));
    }

    }
}
