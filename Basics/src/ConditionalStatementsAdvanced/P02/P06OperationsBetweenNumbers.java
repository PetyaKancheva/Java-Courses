package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int firstNumber=Integer.parseInt((scanner.nextLine()));
         int secondNumber=Integer.parseInt((scanner.nextLine()));
         String operator=scanner.nextLine();
// only of division
         if (firstNumber==0 ){
             System.out.printf("Cannot divide %d by zero",secondNumber);
         }else if(secondNumber==0){
             System.out.printf("Cannot divide %d by zero",firstNumber);
         }else{

         }
    }
}
