package DataTypesAndVariables.P02;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int startChar=97;
        int endChar=97+n;
        for (int i = startChar; i <endChar ; i++) {

            for (int j = startChar;j <endChar ; j++) {

                for (int k = startChar; k <endChar ; k++) {

                    System.out.printf("%s%s%s%n",(char)i,(char)j,(char)k);

                }
            }
        }
    }
}
