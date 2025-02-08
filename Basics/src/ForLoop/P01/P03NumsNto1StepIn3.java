package ForLoop.P01;

import java.util.Scanner;

public class P03NumsNto1StepIn3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int inputNumber=Integer.parseInt(scanner.nextLine());

         for(int i=1; i<=inputNumber;i+=3){
             System.out.println(i);
         }

    }
}
