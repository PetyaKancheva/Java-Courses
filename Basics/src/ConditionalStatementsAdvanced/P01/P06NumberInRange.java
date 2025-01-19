package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P06NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber=Integer.parseInt(scanner.nextLine());
        if(inputNumber<-100 || inputNumber >100 || inputNumber==0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
