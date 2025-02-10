package NestedLoop.P02;

import java.util.Scanner;

public class P01Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int count=0;

        for (int i = 1; i <=num ; i++) {

            for (int j = 1; j <=i; j++) {
                count++;
                System.out.printf("%d ", count);
                if(count==num){
                    i=num;
                    break;
                }
            }
            System.out.println();
        }
    }
}
