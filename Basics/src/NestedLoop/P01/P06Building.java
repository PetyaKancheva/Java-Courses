package NestedLoop.P01;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floors=Integer.parseInt(scanner.nextLine());
        int rooms=Integer.parseInt(scanner.nextLine());

        for (int f =floors; f>=1 ; f--) {
            for (int j = 0; j <rooms ; j++) {
                    String prefix="";
                    if(f==floors){
                        prefix="L";
                    }else if(f%2!=0){
                        prefix="A";
                    }else{
                        prefix="O";
                    }
                System.out.printf("%s%d%d ",prefix,f,j);

            }
            System.out.println();
        }
    }
}
