package WhileLoop.P01;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialNumber=Integer.parseInt(scanner.nextLine());

        int sum=0;

        while(sum<initialNumber){
            int currentNumber=Integer.parseInt(scanner.nextLine());
            sum+=currentNumber;
        }
        System.out.println(sum);
    }
}
