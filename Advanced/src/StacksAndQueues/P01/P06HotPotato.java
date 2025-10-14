package StacksAndQueues.P01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toCollection(ArrayDeque::new));
        int tossCount = Integer.parseInt(scanner.nextLine());

        while (queue.size()>1){
            for (int i = 0; i <tossCount ; i++) {
                if(i==tossCount-1){
                    System.out.println("Removed " +queue.remove());
                }
            }
        }

        System.out.println(queue.peek());
    }
}
