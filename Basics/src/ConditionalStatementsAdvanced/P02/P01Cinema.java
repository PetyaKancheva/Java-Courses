package ConditionalStatementsAdvanced.P02;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection= scanner.nextLine();
        int rows=Integer.parseInt(scanner.nextLine());
        int columns=Integer.parseInt(scanner.nextLine());

        double pricePerTicket=0;

        if(typeProjection.equals("Premiere")){
            pricePerTicket=12;
        }else if(typeProjection.equals("Normal")){
            pricePerTicket=7.5;
        }else if(typeProjection.equals("Discount")){
            pricePerTicket=5;
        }

        double income=rows*columns*pricePerTicket;
        System.out.printf("%.2f leva",income);
    }



}
