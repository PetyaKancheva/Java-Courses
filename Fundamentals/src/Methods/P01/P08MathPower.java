package Methods.P01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
      int power=Integer.parseInt(scanner.nextLine());
      double result=  getPower(num,power);
        System.out.println(new DecimalFormat("0.#####").format(result) );
    }

    private static double getPower(double num, int power) {
        return Math.pow(num,power);
    }
}
