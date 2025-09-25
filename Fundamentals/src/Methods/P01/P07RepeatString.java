package Methods.P01;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        int count=Integer.parseInt(scanner.nextLine());
        String repatedString = repeat(string,count);
        System.out.println(repatedString);
    }

    private static String repeat(String string, int count) {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <count ; i++) {
            sb.append(string);
        }
        return                sb.toString();
    }
}
