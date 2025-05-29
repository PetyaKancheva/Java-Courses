package BasicSyntax.P01;

import java.util.Scanner;

public class P04TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int hour = Integer.parseInt(scr.nextLine());
        int second = Integer.parseInt(scr.nextLine());
        second += 30;
        if (second >= 60) {
            second-=60;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
        System.out.printf("%d:%02d",hour,second);
    }
}
