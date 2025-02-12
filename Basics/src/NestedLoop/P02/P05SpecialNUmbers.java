package NestedLoop.P02;

import java.util.Scanner;

public class P05SpecialNUmbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <=9999 ; i++) {
                int currentNum=i;
            boolean isSpecial=true;
            for (int j = 1; j <=4 ; j++) {
                    int currentDigit =currentNum%10;
                    currentNum/=10;
                    if(currentDigit==0){
                        isSpecial=false;
                        break;
                    }
                    if(num%currentDigit!=0){
                        isSpecial=false;
                    }
            }
            if(isSpecial){
                System.out.printf("%d ",i);
            }
        }
    }
}
