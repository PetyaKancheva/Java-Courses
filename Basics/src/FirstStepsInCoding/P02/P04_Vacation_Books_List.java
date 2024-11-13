package FirstStepsInCoding.P02;

import java.util.Scanner;

public class P04_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int pages=Integer.parseInt(scanner.nextLine());
         int pagesPerHour=Integer.parseInt(scanner.nextLine());
         int days=Integer.parseInt(scanner.nextLine());
         int totalHours=pages/pagesPerHour;
         int result= totalHours/days;
        System.out.println(result);

    }
}
