package ConditionalStatements.P01;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfFigure=scanner.nextLine();
        double area=0;
        switch (typeOfFigure) {
            case"square":
                double side=Double.parseDouble(scanner.nextLine());
                area=side*side;
                break;
            case"rectangle":
                double sideFirst=Double.parseDouble(scanner.nextLine());
                double sideSecond=Double.parseDouble(scanner.nextLine());
                area=sideFirst*sideSecond;
                break;
            case"circle":
                double radius=Double.parseDouble(scanner.nextLine());
                area=Math.PI*radius*radius;
                break;
            case"triangle":
                double base=Double.parseDouble(scanner.nextLine());
                double height=Double.parseDouble(scanner.nextLine());
                area=(base*height)/2;
                break;
        }
        System.out.printf("%.3f",area);
    }
}
