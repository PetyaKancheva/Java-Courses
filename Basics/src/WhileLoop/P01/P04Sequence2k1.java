package WhileLoop.P01;

import java.util.Scanner;

public class P04Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.next());
        int currentNum = 1;
        while (currentNum <= inputNum) {
            System.out.println(currentNum);
            currentNum = currentNum * 2 + 1;
        }
    }
}

