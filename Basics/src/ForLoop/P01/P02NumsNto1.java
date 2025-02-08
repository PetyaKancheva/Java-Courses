package ForLoop.P01;

import java.util.Scanner;

public class P02NumsNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber= Integer.parseInt(scanner.nextLine());
            for(int i=inputNumber;i>=1;i--){
                System.out.println(i);
        }
    }
}
