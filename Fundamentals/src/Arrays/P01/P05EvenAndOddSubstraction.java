package Arrays.P01;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] intArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         int evenSum=0;
         int oddSum=0;
        for (int num:intArray) {
            if(num%2==0){
                evenSum+=num;
            }else{
                oddSum+=num;
            }
                    }
        System.out.println(evenSum-oddSum);
    }
}
