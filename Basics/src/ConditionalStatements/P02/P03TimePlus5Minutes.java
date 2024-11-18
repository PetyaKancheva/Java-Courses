package ConditionalStatements.P02;

import java.util.Scanner;

public class P03TimePlus5Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours=Integer.parseInt(scanner.nextLine());
        int minutes=Integer.parseInt(scanner.nextLine());
         minutes+=15;

        if(minutes>59){
            hours+=1;
            minutes-=60;
        }
        if(hours>23){
            hours-=24;
        }

        System.out.printf("%d",hours);
        System.out.printf(":");
        if(minutes<10){
            System.out.printf("0%d",minutes);
        }else{
            System.out.printf("%d",minutes);
        }


    }
}
