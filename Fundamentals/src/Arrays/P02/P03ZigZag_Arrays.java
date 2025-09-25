package Arrays.P02;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[count];
        int[] secondArr = new int[count];

        for (int i = 0; i < count; i++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                firstArr[i] = currentArr[0];
                secondArr[i] = currentArr[1];
            } else {
                secondArr[i] = currentArr[0];
                firstArr[i] = currentArr[1];
            }
        }

        for (int e : firstArr) {
            System.out.printf(e + " ");
        }

        System.out.println();

        for (int e : secondArr) {
            System.out.printf(e + " ");
        }
    }
}
