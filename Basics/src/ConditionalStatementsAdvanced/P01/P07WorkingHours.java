package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P07WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int inputHour=Integer.parseInt((scanner.nextLine()));
         String inputDay=scanner.nextLine();

         if(inputHour>=10 &&                  inputHour<=18){
              if(inputDay.equals("Monday")||
                      inputDay.equals("Tuesday")||
                      inputDay.equals("Wednesday")||
                      inputDay.equals("Thursday")||
                      inputDay.equals("Friday")||
                      inputDay.equals("Saturday")
              ){
                  System.out.println("open");
              } else{
                  System.out.println("closed");
             }
         }else{
             System.out.println("closed");
         }


    }
}
