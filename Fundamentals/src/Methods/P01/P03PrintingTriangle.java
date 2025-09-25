package Methods.P01;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        printTriangle(num);
    }

    private static void printTriangle(int num) {
        printTopTriangle(num);
        printBottomTriangle(num);

    }

    private static void printTopTriangle(int num) {
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf(j +" ");
            }
            System.out.println();
        }
    }

    private static void printBottomTriangle(int num) {
        for (int i = num-1; i>=1  ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.printf(j +" ");
            }
            System.out.println();
        }
    }
}
