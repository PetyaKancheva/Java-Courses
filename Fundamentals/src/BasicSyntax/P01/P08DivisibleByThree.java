package BasicSyntax.P01;

import java.util.Scanner;

public class P08DivisibleByThree {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i);
        }
    }
}
