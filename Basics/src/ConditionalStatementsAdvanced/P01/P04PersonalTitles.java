package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double inputAge=Double.parseDouble(scanner.nextLine());
         char inputGender=scanner.nextLine().charAt(0);
         String outputTitle="";
        if(inputGender=='f'){
            if(inputAge>=16){
                outputTitle="Ms.";
            }else if (inputAge<16){
                outputTitle="Miss";
            }
        } else if (inputGender=='m') {

            if(inputAge>=16){
                outputTitle="Mr.";
            }else if (inputAge<16){
                outputTitle="Master";
            }
        }

        System.out.println(outputTitle);
    }

}
