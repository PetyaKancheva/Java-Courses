package FirstStepsInCoding.P02;

import java.util.Scanner;

public class P09_Fish_Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1л=1 дм3
        int length =Integer.parseInt(scanner.nextLine());
        int width =Integer.parseInt(scanner.nextLine());
        int height =Integer.parseInt(scanner.nextLine());
        double percentage =Double.parseDouble(scanner.nextLine())/100;

        int volumeRaw=length*width*height;
        double totalVolumeLtr =volumeRaw*0.001;
        double usableVolumeLtr=totalVolumeLtr*(1-percentage);
        System.out.printf("%.2f",usableVolumeLtr);
    }
}
