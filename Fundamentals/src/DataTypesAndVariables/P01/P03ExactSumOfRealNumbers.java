package DataTypesAndVariables.P01;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum=BigDecimal.ZERO;
        for (int i = 1; i <=n ; i++) {
            BigDecimal number=new BigDecimal(scanner.nextLine());
            sum=sum.add(number);
        }

        System.out.println(String.valueOf(sum));
    }
}
