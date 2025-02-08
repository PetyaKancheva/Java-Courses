package ForLoop.P02;


import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int iCount = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <=iCount ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max) {
                max = number;
            }
        }
          int correctedSum=sum-max;

           if(correctedSum==max){
               System.out.printf("Yes%nSum = %d",max);
           }else{
               System.out.printf("No%nDiff = %d",Math.abs(correctedSum-max));
        }
    }
}
