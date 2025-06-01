package DataTypesAndVariables.P01;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        for (int i = 0; i < 3; i++) {
            char charachter = scanner.nextLine().charAt(0);
            word+=charachter;
        }
        System.out.println(word);
    }
}
