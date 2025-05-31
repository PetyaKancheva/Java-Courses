package BasicSyntax.P02;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
//        2, 3, 6, 7, 10.
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        List<Integer> numArray= List.of(10,7,6,3,2);
        boolean isDivisible=false;
       for (int dividerNum:numArray){
           if(number%dividerNum==0){
               System.out.printf("The number is divisible by %d",dividerNum);
               isDivisible=true;
               break;
           }
       }
        if(!isDivisible){
            System.out.println("Not divisible");
        }

    }
}
