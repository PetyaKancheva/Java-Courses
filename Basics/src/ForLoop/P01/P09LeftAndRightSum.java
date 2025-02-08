package ForLoop.P01;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        int leftSum=0;
        int rightSum=0;

        for (int i = 1; i <=n ; i++) {
            int inputNum=Integer.parseInt(scanner.nextLine());
            leftSum+=inputNum;
        }
        for (int i = 1; i <=n ; i++) {
            int inputNum=Integer.parseInt(scanner.nextLine());
           rightSum+=inputNum;
        }

        if (leftSum==rightSum){
            System.out.printf("Yes, sum = %d",rightSum);
        }else{
            System.out.printf("No, diff = %d",Math.abs(leftSum-rightSum));
        }
    }
}
