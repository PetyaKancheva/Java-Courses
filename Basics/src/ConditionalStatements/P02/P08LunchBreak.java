package ConditionalStatements.P02;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfShow = scanner.nextLine();
        int durationEpisode = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double durationLunch = (durationBreak*1.0)/ 8;
        double durationRelaxation =( durationBreak*1.0) / 4;
        double totalRequiredTime = durationEpisode + durationLunch + durationRelaxation;
        double result = Math.ceil(totalRequiredTime -durationBreak );
        if (result <=0) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", nameOfShow, Math.abs(result));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", nameOfShow,result );
        }
    }
}
