package Methods.P01;

import java.util.Scanner;

public class P01SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        
        printIntegerSign(num);
    }

    private static void printIntegerSign(int num) {
        if(num==0){
            System.out.printf("The number %d is zero.",num);
        }else if(num>0){
            System.out.printf("The number %d is positive.",num);
        }else if(num<0){
            System.out.printf("The number %d is negative.",num);
        }

    }
}
