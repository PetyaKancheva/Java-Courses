package BasicSyntax.P02;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum=Integer.parseInt(scanner.nextLine());
        int endNUm=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for (int i = startNum; i <=endNUm ; i++) {
            System.out.printf(i +" ");
            sum+=i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
