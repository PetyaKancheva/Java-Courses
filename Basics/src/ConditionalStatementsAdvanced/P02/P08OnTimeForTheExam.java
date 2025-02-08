package ConditionalStatementsAdvanced.P02;


import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int difference = arrivalTime - examTime;
        if (difference>59){
            System.out.println("Late");
            System.out.printf("%d : %02d hours after the start",difference/60,difference%60);
        }else if(difference>0){
            System.out.println("Late");
            System.out.printf( "%d minutes after the start",difference);
        }else if(difference==0){
            System.out.println("On time");
        }else if(difference>=-30){
            System.out.println("On time");
            difference=Math.abs(difference);
            System.out.printf( "%d minutes before the start",difference);
        }else if(difference>-59){
            System.out.println("Early");
            difference=Math.abs(difference);
            System.out.printf( "%d minutes before the start",difference);
        } else {
            System.out.println("Early");
            difference=Math.abs(difference);
            System.out.printf("%d : %02d hours before the start",difference/60,difference%60);
        }




    }
}

