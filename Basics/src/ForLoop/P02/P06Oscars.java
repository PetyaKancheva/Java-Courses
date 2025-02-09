package ForLoop.P02;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nominatedActor=scanner.nextLine();
        double accumulatedPoints=Double.parseDouble(scanner.nextLine());
        int countReviews=Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countReviews ;i++) {
             String reviewerName=scanner.nextLine();
             double points=Double.parseDouble(scanner.nextLine());
             double reviewerPoints=(reviewerName.length()*points)/2;
            accumulatedPoints +=reviewerPoints;

            if(accumulatedPoints>=1250.5 ){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nominatedActor,accumulatedPoints);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!",nominatedActor,(1250.5-accumulatedPoints));
        
    }
}
