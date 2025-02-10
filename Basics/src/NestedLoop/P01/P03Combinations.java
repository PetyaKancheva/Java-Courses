package NestedLoop.P01;

import java.util.Scanner;

public class P03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int inputNum=Integer.parseInt(scanner.nextLine());
         int countCombinations=0;
        for (int i = 0; i <=inputNum; i++) {
            for (int j = 0; j <=inputNum ; j++) {
                for (int k = 0; k <=inputNum; k++) {
                    if ((i+j+k)==inputNum){
                        countCombinations++;
                    }
                }
            }
        }
        System.out.println(countCombinations);
    }
}
