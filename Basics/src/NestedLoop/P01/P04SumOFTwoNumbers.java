package NestedLoop.P01;

import java.util.Scanner;

public class P04SumOFTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalStart=Integer.parseInt(scanner.nextLine());
        int intervalEnd=Integer.parseInt(scanner.nextLine());
        int magicNum=Integer.parseInt(scanner.nextLine());
        int count=0;
        int firstNum=0;
        int secondNum=0;
        boolean isFound=false;
        for (int i = intervalStart; i <=intervalEnd ; i++) {
            for (int j = intervalStart; j <=intervalEnd; j++) {
                        count++;
                       if(i+j==magicNum){
                            isFound=true;
                            firstNum=i;
                            secondNum=j;
                           break;
                       }
            }
            if(isFound){
                break;
            }
        }
        if(isFound){
            System.out.printf("Combination N:%d (%d + %d = %d)",count,firstNum,secondNum,magicNum);
        }else {
            System.out.printf(	"%d combinations - neither equals %d",count,magicNum);
        }

    }
}
