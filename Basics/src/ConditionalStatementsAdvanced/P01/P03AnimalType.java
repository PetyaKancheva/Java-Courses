package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputAnimal = scanner.nextLine();
        String outputAnimal = "";
        switch (inputAnimal) {
            case "dog":
                outputAnimal = "mammal";
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                outputAnimal = "reptile";
                break;
            default:
                outputAnimal="unknown";
        }
        System.out.println(outputAnimal);
    }
}
