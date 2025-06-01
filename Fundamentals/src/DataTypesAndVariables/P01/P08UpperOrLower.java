package DataTypesAndVariables.P01;

import java.util.Scanner;

public class P08UpperOrLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input=scanner.nextLine().charAt(0);
        if(input>=97){
            System.out.println("lower-case");
        }else{
            System.out.println("upper-case");

        }
    }
}
