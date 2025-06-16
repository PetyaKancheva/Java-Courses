package DataTypesAndVariables.P02;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people=Integer.parseInt(scanner.nextLine());
        int capacityPerCourse=Integer.parseInt(scanner.nextLine());
        int division=people/capacityPerCourse;
        int divisionRest=people%capacityPerCourse;
        if(divisionRest>0){
            System.out.println(division+1);
        }else{
            System.out.println(division);
        }
    }
}
