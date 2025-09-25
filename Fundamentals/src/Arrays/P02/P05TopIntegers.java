package Arrays.P02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> topIntegers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            int currentInt = input[i];

            boolean found = true;
            for (int j = i; j < input.length - 1; j++) {
                if (currentInt <= input[j + 1]) {
                    found = false;
                    break;
                }
            }
            if (found) { topIntegers.add(currentInt);  }
        }

        topIntegers.forEach(e ->System.out.printf("%d ", e));
    }

}

