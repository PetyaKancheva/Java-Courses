package ConditionalStatements.P02;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=Integer.parseInt(scanner.nextLine());
        double bonus=0;
        if(number<=100){
            bonus=5;
        }else if(number<=1000){
            bonus=number*0.2;
        }else{
            bonus=number*0.1;
        }
        double additionalBonus=0;
        if (number % 2 == 0) {
            additionalBonus+=1;
        }
        if(number%10==5){
            additionalBonus+=2;
        }
        System.out.println(bonus+additionalBonus);
        System.out.println(bonus+additionalBonus+number);

    }

}
