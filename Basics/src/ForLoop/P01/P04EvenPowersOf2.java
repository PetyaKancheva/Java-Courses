package ForLoop.P01;

import java.util.Scanner;

public class P04EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <=inputNumber ; i+=2) {
            System.out.println((int)Math.pow(2,i));
        }
    }

}
