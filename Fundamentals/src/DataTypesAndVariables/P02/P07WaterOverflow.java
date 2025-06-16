package DataTypesAndVariables.P02;

import java.util.Scanner;

public class P07WaterOverflow {
    private final static int MAX_CAPACITY=255;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentCapacity=0;

        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            int currentLiters=Integer.parseInt(scanner.nextLine());
            int calculation=currentCapacity+currentLiters;
            if(calculation<=MAX_CAPACITY){
                currentCapacity+=currentLiters;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentCapacity);
    }
}
