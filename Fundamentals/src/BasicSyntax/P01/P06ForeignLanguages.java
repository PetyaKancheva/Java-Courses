package BasicSyntax.P01;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String country=scr.nextLine();
        String language;
        if(country.equals("USA")|| country.equals("England")){
            language="English";
        }else if(country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            language="Spanish";
        }else{
            language="unknown";
        }
        System.out.println(language);
    }
}
