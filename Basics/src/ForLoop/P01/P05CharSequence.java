package ForLoop.P01;

import java.util.Scanner;

public class P05CharSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString =scanner.nextLine();
        for(int i=0;i<inputString.length();i++){
            System.out.println(inputString.charAt(i));
        }
    }
}
