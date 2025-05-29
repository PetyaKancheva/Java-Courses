package BasicSyntax.P01;

import java.util.Scanner;

public class P03PassedOrFailed {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double grade=Double.parseDouble(scr.nextLine());
        if(grade>=3){
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }

    }
}

