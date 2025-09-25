package Arrays.P02;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean found=false;
        for (int i = 0; i < input.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    leftSum += input[j];
                }
            }

            if(i<input.length-1){
                for (int k = i + 1; k < input.length; k++) {
                    rightSum += input[k];
                }
            }

            if (rightSum == leftSum) {
                System.out.println(i);
                found=true;
            }
        }

        if(!found){
            System.out.println("no");
        }
    }
}
