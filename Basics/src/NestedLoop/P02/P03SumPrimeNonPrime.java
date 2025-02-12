package NestedLoop.P02;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPrimeNums = 0;
        int sumNonPrimeNums = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int currentNum = Integer.parseInt(input);
            if (currentNum < 0) {
                System.out.println("Number is negative.");
            } else if (currentNum==0) {
                sumNonPrimeNums += currentNum;
            } else if (currentNum==1) {
                sumPrimeNums += currentNum;
            } else  {
                boolean isPrime=true;
                for (int i = 2; i < currentNum; i++) {
                    if(currentNum%i==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    sumPrimeNums += currentNum;
                }else{
                    sumNonPrimeNums += currentNum;
                }

            }

            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrimeNums);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrimeNums);

    }


}
