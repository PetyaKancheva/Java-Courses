package ConditionalStatements.P01;

import java.util.Scanner;

public class P06SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed=Double.parseDouble(scanner.nextLine());

        String message ="";
        if (speed<=10){
            message="slow";
        }else if (speed<=50){
            message="average";
        }else if(speed<=150){
            message="fast";
        }else if(speed<=1000){
            message="ultra fast";
        }else{
            message="extremely fast";
        }

        System.out.println(message);
    }
}
