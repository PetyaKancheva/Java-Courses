package FirstStepsInCoding.P01;

import java.util.Scanner;

public class P04Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNumberInch= Double.parseDouble(scanner.nextLine());
        double outputValueCentimeter=inputNumberInch*2.54;
        System.out.println(outputValueCentimeter);
    }
}
