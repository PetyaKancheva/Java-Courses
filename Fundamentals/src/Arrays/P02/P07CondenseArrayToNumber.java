package Arrays.P02;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (inputArr.length>1) {
            int[]condensedArr =  new int[ inputArr.length-1] ;
            for (int i = 0; i < inputArr.length - 1; i++) {
                int sumNum = inputArr[i] + inputArr[i + 1];
                condensedArr[i]=sumNum;
            }
            inputArr=condensedArr;

        }

        System.out.println(inputArr[0]);

    }
}
