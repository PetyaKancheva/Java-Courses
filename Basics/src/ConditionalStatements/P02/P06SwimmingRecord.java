package ConditionalStatements.P02;

import java.util.Scanner;

public class P06SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wordRecord=Double.parseDouble(scanner.nextLine());
        double distanceInMeters=Double.parseDouble(scanner.nextLine());
        double oneMeterDistancePerSecond=Double.parseDouble(scanner.nextLine());

        double ivansRecord=distanceInMeters*oneMeterDistancePerSecond;
        double waterResistance=(Math.floor(distanceInMeters/15) )*12.5;
        ivansRecord+=waterResistance;
        double result=wordRecord-ivansRecord;
        if (result<=0){
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(result));
        }else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivansRecord);
        }


    }
}
