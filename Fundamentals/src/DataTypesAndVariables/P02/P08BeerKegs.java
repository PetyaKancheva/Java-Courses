package DataTypesAndVariables.P02;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        π * r^2 * h
                int n=Integer.parseInt(scanner.nextLine());
                String nameBiggestKeg="";
                double sizeBiggestKeg=0;
        for (int i = 0; i <n ; i++) {
            String model=scanner.nextLine();
             double radius = Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            double currentKegSize=Math.PI*radius*radius*height;
            if(currentKegSize>sizeBiggestKeg){
                sizeBiggestKeg=currentKegSize;
                nameBiggestKeg=model;
            }
        }

        System.out.println(nameBiggestKeg);
    }
}
