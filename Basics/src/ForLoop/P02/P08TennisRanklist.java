package ForLoop.P02;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments=Integer.parseInt(scanner.nextLine());
        int staringPoints=Integer.parseInt(scanner.nextLine());
        int accumulatedPoints=0;
        int wins=0;
        for (int i = 1;i <=tournaments ; i++) {
             String tournamentResult=scanner.nextLine();
                switch (tournamentResult){
                    case "W":
                        accumulatedPoints+=2000;
                        wins++;
                        break;
                    case"F":
                        accumulatedPoints+=1200;
                        break;
                    case"SF":
                        accumulatedPoints+=720;
                        break;
                }
        }

        System.out.printf("Final points: %d%n",accumulatedPoints+staringPoints);
        System.out.printf("Average points: %d%n",accumulatedPoints/tournaments);
        System.out.printf("%.2f%%",wins*1.0/tournaments*100);


    }
}
