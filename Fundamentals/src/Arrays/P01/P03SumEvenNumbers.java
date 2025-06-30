package Arrays.P01;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers  =  Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            int currentNum= numbers[i];
            if(currentNum%2==0){
                sum+=currentNum;
            }
        }

        System.out.println(sum);
    }
}
