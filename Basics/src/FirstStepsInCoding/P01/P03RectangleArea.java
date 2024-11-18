package FirstStepsInCoding.P01;



import java.util.Scanner;

public class P03RectangleArea {
    public static  void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        int firstInputNumber = Integer.parseInt(scanner.nextLine());
        int secondInputNumber = Integer.parseInt(scanner.nextLine());
        int area=firstInputNumber*secondInputNumber;
        System.out.println(area);
    }

}
