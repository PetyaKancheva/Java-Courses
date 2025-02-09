package ForLoop.P02;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroups=Integer.parseInt(scanner.nextLine());
        int totalPeople=0;
        int climbersMusala=0;
        int climbersMontblanc=0;
        int climbersKilimanjaro=0;
        int climbersK2=0;
        int climbersEverest=0;

        for (int i = 1; i <=countGroups ; i++) {
            int currentGroupSize=Integer.parseInt(scanner.nextLine());
            totalPeople+=currentGroupSize;

            if(currentGroupSize<=5){
                    climbersMusala+=currentGroupSize;
            }else if(currentGroupSize<=12){
                    climbersMontblanc+=currentGroupSize;
            }else if(currentGroupSize<=25){
                climbersKilimanjaro+=currentGroupSize;
            }else if(currentGroupSize<=40){
                climbersK2+=currentGroupSize;
            }else{
                climbersEverest+=currentGroupSize;
            }

        }

        System.out.printf("%.2f%%%n",climbersMusala*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",climbersMontblanc*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",climbersKilimanjaro*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",climbersK2*1.0/totalPeople*100);
        System.out.printf("%.2f%%%n",climbersEverest*1.0/totalPeople*100);
    }
}
