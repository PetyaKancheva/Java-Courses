package BasicSyntax.P01;

import java.util.Scanner;

public class P11EvenNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        while(scr.hasNext()){
            int number = Integer.parseInt(scr.nextLine());
           if(number%2==0){
                System.out.println("The number is: " + Math.abs(number));
            }else {
                System.out.println("Please write an even number.");
            }

        }

    }
}
