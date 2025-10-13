package StacksAndQueues.P01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + queue.remove());
                }

            } else {
                queue.add(command);
            }

            command = scanner.nextLine();
        }

       for(    String element:queue)   {
        System.out.println(queue.remove());
    }
    }
}
