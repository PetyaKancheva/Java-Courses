package ForLoop.P01;

import java.util.Scanner;

public class P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int count=Integer.parseInt(scanner.nextLine());
         int sum=0;
         for(int i =1;i<=count;i++){
              int inputNumber=Integer.parseInt(scanner.nextLine());
              sum+=inputNumber;
        }

             System.out.println(sum);
    }
}
