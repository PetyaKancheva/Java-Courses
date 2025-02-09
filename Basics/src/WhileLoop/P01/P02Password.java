package WhileLoop.P01;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username=scanner.nextLine();
        String password=scanner.nextLine();
        String inputWord=scanner.nextLine();
        while(!inputWord.equals(password)){
            inputWord=scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
