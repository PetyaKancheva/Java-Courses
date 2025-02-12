package NestedLoop.P02;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input=scanner.nextLine();
            int totalTickets=0;
            int kindsTickets=0;
            int studentTickets=0;
            int standardTickets=0;

            while(!input.equals("Finish")){
                    String filmName=input;
                    int capacity=Integer.parseInt(scanner.nextLine());
                    int currentCapacity=0;

                    String currentInput=scanner.nextLine();

                    while(!currentInput.equals("End") ){
                            switch (currentInput){
                                case"student" ->studentTickets++;
                                case"kid" ->kindsTickets++;
                                case"standard" ->standardTickets++;
                            }
                            currentCapacity++;
                            totalTickets++;
                        if(currentCapacity==capacity){
                            break;
                        }
                            currentInput=scanner.nextLine();
                    }
                System.out.printf("%s - %.2f%% full.%n",filmName,currentCapacity*1.0/capacity*100);

                input=scanner.nextLine();
            }

        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",studentTickets*1.0/totalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",standardTickets*1.0/totalTickets*100);
        System.out.printf("%.2f%% kids tickets.%n",kindsTickets*1.0/totalTickets*100);

    }
}
