package WhileLoop.P01;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText=scanner.nextLine();
        while (!inputText.equals("Stop")){
            System.out.println(inputText);
            inputText=scanner.nextLine();
        }

    }
}
