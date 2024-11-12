package FirstStepsInCoding.P01;

import java.util.Scanner;

public class P07_Projects_Creation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String architectName=scanner.nextLine();
        int projectCount= Integer.parseInt(scanner.nextLine());
        int projectHours= projectCount*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",architectName,projectHours,projectCount);
    }
}
