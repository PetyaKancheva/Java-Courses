package Arrays.P02;

import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());
        int [] train = new int[count];
        int sum=0;
        for (int i = 0; i <count ; i++) {
            int currentNum=Integer.parseInt(scanner.nextLine());
            train[i]=currentNum;
            sum+=currentNum;
        }
        for (int i = 0; i < count; i++) {
            System.out.printf("%d ",train[i]);
        }
        System.out.println();
        System.out.println(sum);
    }
}
