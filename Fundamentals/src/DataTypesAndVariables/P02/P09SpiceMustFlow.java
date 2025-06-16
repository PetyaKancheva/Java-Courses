package DataTypesAndVariables.P02;

import java.util.Scanner;

public class P09SpiceMustFlow {
    private static final int DAY_CONSUMPTION=26;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int startYield=Integer.parseInt(scanner.nextLine());
    int days=0;
    int totalYield=0;

    int dayYield=startYield;
    while (dayYield>=100){
        totalYield+=dayYield-DAY_CONSUMPTION;
        dayYield-=10;
        days++;
    }
    if(totalYield>=DAY_CONSUMPTION){

        totalYield-=DAY_CONSUMPTION;
    }

        System.out.println(days);
        System.out.println(totalYield);
    }
}
