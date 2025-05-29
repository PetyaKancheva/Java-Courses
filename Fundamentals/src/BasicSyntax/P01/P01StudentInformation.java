package BasicSyntax.P01;

import java.util.Scanner;

public class P01StudentInformation {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String name=scr.nextLine();
        int age=Integer.parseInt(scr.nextLine());
        double grade=Double.parseDouble(scr.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f",name,age,grade);
    }
}
