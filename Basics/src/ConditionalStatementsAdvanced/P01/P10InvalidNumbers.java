package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P10InvalidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber=Integer.parseInt(scanner.nextLine());

        if(((inputNumber != 0)&&(inputNumber < 100) )|| (inputNumber > 200)  ){
            System.out.println("invalid");
        }
    }
}
