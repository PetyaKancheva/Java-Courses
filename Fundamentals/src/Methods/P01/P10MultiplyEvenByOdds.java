package Methods.P01;

import java.util.Scanner;

public class P10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int result = getMultipleOfEvenAndOdd(num);

        System.out.println(result);

    }

    private static int getMultipleOfEvenAndOdd(int num) {
        int evenSum = getEvenSum(num);
        int oddSUm = geEOddSum(num);

        return evenSum * oddSUm;
    }

    private static int getEvenSum(int num) {
        int sum=0;
        int length= String.valueOf(num).length();
        for (int i = 0; i <length; i++) {
            int currentDigit=num%10;
            num/=10;
            if(currentDigit%2==0){
                sum+=currentDigit;
            }
        }
        return sum;
    }

    private static int geEOddSum(int num) {
        int sum=0;
        int length= String.valueOf(num).length();
        for (int i = 0; i <length; i++) {
            int currentDigit=num%10;
            num/=10;
            if(currentDigit%2!=0){
                sum+=currentDigit;
            }
        }
        return sum;
    }


}
