package BasicSyntax.P01;

import java.util.Scanner;

public class P12RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int currNum=2 * i + 1;
            System.out.println(currNum);
            sum +=currNum;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
