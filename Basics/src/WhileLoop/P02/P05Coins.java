package WhileLoop.P02;

import java.math.BigDecimal;
import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         BigDecimal inputMoney= new BigDecimal(scanner.nextLine());
         int coinsCount=0;
         while(inputMoney.compareTo(BigDecimal.ZERO)>0){

             if(inputMoney.compareTo(BigDecimal.valueOf(2))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(2));
                 coinsCount++;
             }   else if(inputMoney.compareTo(BigDecimal.valueOf(1))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(1));
                 coinsCount++;
             }  else if(inputMoney.compareTo(BigDecimal.valueOf(0.5))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(0.5));
                 coinsCount++;
             }  else if(inputMoney.compareTo(BigDecimal.valueOf(0.2))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(0.2));
                 coinsCount++;
             }  else if(inputMoney.compareTo(BigDecimal.valueOf(0.1))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(0.1));
                 coinsCount++;
             }  else if(inputMoney.compareTo(BigDecimal.valueOf(0.05))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(0.05));
                 coinsCount++;
             }  else if(inputMoney.compareTo(BigDecimal.valueOf(0.02))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(0.02));
                 coinsCount++;
             }  else if(inputMoney.compareTo(BigDecimal.valueOf(0.01))>=0) {
                 inputMoney=   inputMoney.subtract(BigDecimal.valueOf(0.01));
                 coinsCount++;
             }

         }
        System.out.println(coinsCount);

    }
}
