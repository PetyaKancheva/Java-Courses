package WhileLoop.P02;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costOfVacation=Double.parseDouble(scanner.nextLine());
        double savedMoney=Double.parseDouble(scanner.nextLine());
        int totalDays=0;
        int daysOnlySpending=0;
        while(savedMoney<costOfVacation && daysOnlySpending<5){
            String command=scanner.nextLine();
            double currentMoney=Double.parseDouble(scanner.nextLine());
                if(command.equals("save")){
                  savedMoney+=currentMoney;
                  daysOnlySpending=0;
                }else if(command.equals("spend")){
                    savedMoney-=currentMoney;
                    daysOnlySpending++;
                    if(savedMoney<0){
                        savedMoney=0;
                    }
                }
                totalDays++;
        }
        if(daysOnlySpending==5){
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        }

        if(savedMoney>=costOfVacation){
            System.out.printf("You saved the money for %d days.",totalDays);
        }
    }
}
