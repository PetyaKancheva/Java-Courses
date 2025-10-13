package StacksAndQueues.P01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (num!=0){
            int digit=num %2;
            stack.push(digit);
            num/=2;
        }
        for (int e:stack) {
            System.out.print(stack.pop());
        }
    }
}
