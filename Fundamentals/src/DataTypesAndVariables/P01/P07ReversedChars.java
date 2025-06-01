package DataTypesAndVariables.P01;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word="";
        for (int i = 0; i <3 ; i++) {
            char currentChar=scanner.nextLine().charAt(0);
            word+=currentChar;
        }
        for (int i = 2; i >= 0 ; i--) {
            System.out.printf(word.charAt(i)+" ");
        }
    }
}
