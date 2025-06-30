package Arrays.P01;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countIterations=Integer.parseInt(scanner.nextLine());
        int[] intArray= new int[countIterations];
        for (int i = 0; i < countIterations; i++) {
            intArray[i]=Integer.parseInt(scanner.nextLine());
        }
        for (int        i =countIterations-1; i >=0 ; i--) {
            System.out.printf("%d ",intArray[i]);
        }
    }
}
