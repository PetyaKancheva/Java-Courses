package ConditionalStatements.P01;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString=scanner.nextLine();
         String password="s3cr3t!P@ssw0rd";
         if(inputString.equals(password)){
             System.out.println("Welcome");
         }else{
             System.out.println("Wrong password!");
         }
    }
}
