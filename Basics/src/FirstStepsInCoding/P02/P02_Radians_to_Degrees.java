package FirstStepsInCoding.P02;

import java.util.Scanner;

public class P02_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radians= Double.parseDouble(scanner.nextLine());
        double radius= radians*180 / Math.PI;
        System.out.println(radius);
    }
}
