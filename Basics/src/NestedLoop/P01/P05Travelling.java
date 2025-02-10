package NestedLoop.P01;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();

        while(!input.equals("End")){
            String destination=input;
            int costVacation=Integer.parseInt(scanner.nextLine());

                while(costVacation>0){
                    int saving=Integer.parseInt(scanner.nextLine());
                   costVacation-=saving;
                }
            System.out.printf( "Going to %s!%n",destination );
            input=scanner.nextLine();
        }
    }
}
