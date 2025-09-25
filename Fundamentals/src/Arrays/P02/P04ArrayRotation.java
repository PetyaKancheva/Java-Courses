package Arrays.P02;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int j = 1; j <= rotations; j++) {
            int[] rotatedArr = new int[inputArr.length];

            for (int i = 0; i < inputArr.length; i++) {

                if (i == inputArr.length - 1) {
                    rotatedArr[i] = inputArr[0];
                } else {
                    rotatedArr[i] = inputArr[i + 1];
                }
            }
            inputArr = rotatedArr;
        }

        for (int e : inputArr) {
            System.out.printf(e + " ");
        }
    }
}
