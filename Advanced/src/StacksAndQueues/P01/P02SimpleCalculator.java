package StacksAndQueues.P01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>();
        int sum = 0;

        for (String element : input) {
            stack.add(element);
        }
//        2 + 5 + 10 - 2 - 1
        while (stack.size() >1) {
            int leftOperand = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int rightOperand = Integer.parseInt(stack.pop());

            if (operator.equals("+")) {
                sum = leftOperand + rightOperand;
            } else if (operator.equals("-")) {
                sum = leftOperand - rightOperand;
            }
            stack.push(String.valueOf(sum));

        }

        System.out.println(stack.peek());

    }
}
