package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int firstNumber=Integer.parseInt((scanner.nextLine()));
         int secondNumber=Integer.parseInt((scanner.nextLine()));
         String operator=scanner.nextLine();

         double result=0;

        if (operator.equals("+")){
            result=firstNumber+secondNumber;
            System.out.printf("%d %s %d = %.0f - %s",firstNumber,operator,secondNumber,result,isEven(result));
        }else if (operator.equals("-")){
            result=firstNumber-secondNumber;
            System.out.printf("%d %s %d = %.0f - %s",firstNumber,operator,secondNumber,result,isEven(result));
        }else if (operator.equals("*")){
            result=firstNumber*secondNumber;
            System.out.printf("%d %s %d = %.0f - %s",firstNumber,operator,secondNumber,result,isEven(result));
        }else if (operator.equals("/")){
            if (firstNumber==0 ){
                System.out.printf("Cannot divide %d by zero",secondNumber);
            }else if(secondNumber==0){
                System.out.printf("Cannot divide %d by zero",firstNumber);
            }else{
                result=firstNumber*1.0/secondNumber;
                System.out.printf("%d %s %d = %.2f",firstNumber,operator,secondNumber,result);
            }
        }else if(operator.equals("%")){
            if (firstNumber==0 ){
                System.out.printf("Cannot divide %d by zero",secondNumber);
            }else if(secondNumber==0){
                System.out.printf("Cannot divide %d by zero",firstNumber);
            }else{
                result=firstNumber%secondNumber;
                System.out.printf("%d %s %d = %.0f",firstNumber,operator,secondNumber,result);
            }
        }

    }
    public static String isEven(double num){
        if(num%2==0){
            return "even";
        }
        return "odd";
    }
}
