package Arrays.P01;

import java.util.Scanner;


public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] letters = scanner.nextLine().split(" ");
        int n = letters.length;
        for (int i = 0; i < letters.length / 2; i++) {
            String firstElement = letters[i];
            String lastElement = letters[n - i -1];
            letters[i] = lastElement;
            letters[n - i -1] = firstElement;
        }
        for (String letter : letters) {
            System.out.print(letter + " ");
        }

    }
}
