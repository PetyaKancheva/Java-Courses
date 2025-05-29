package BasicSyntax.P01;

import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n= Integer.parseInt(scr.nextLine());
        int sum=0;
        for (int i = 1; i <=10; i++) {
            sum=n*i;
            System.out.println(n + " X "+ i +" = " +sum);
        }
    }
}
