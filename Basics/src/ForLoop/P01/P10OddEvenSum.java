package ForLoop.P01;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int iCount = Integer.parseInt(scanner.nextLine());
         int evenSum=0;
         int oddSum=0;

         for (int i=1;i<=iCount; i++){
             int inputNum=Integer.parseInt(scanner.nextLine());
             if(i%2==0){
                 evenSum+=inputNum;
             }else{
                 oddSum+=inputNum;
             }
         }
         if(evenSum==oddSum){
             System.out.printf("Yes\n" +
                     "Sum = %d",evenSum);
         }else{
             System.out.printf("No\n" +
                     "Diff = %d",Math.abs(evenSum-oddSum));
         }
    }
}
