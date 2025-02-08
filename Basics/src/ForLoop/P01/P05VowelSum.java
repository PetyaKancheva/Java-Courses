package ForLoop.P01;

import java.util.Scanner;

public class P05VowelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord=scanner.nextLine();
        int sum=0;
        for(int i =0;i<=inputWord.length()-1;i++){
             char letter=inputWord.charAt(i);
            switch (letter){
                case 'a' -> sum+=1;
                case 'e' -> sum+=2;
                case 'i' -> sum+=3;
                case 'o' -> sum+=4;
                case 'u' -> sum+=5;
            }

        }

        System.out.println(sum);
    }
}
