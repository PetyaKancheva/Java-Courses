package FirstStepsInCoding.P01;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName =scanner.nextLine();
        String lastName =scanner.nextLine();
        int age =Integer.parseInt(scanner.nextLine());
        String town =scanner.nextLine();


        System.out.printf("You are %s %s, a %d-years old person from %s.",firstName,lastName,age,town);
    }
}
