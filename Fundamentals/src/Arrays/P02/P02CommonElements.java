package Arrays.P02;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArr=scanner.nextLine().split(" ");
        String [] secondArr=scanner.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++){
            String currentWord=secondArr[i];
            for (int j = 0; j < firstArr.length; j++) {
                if(currentWord.equals(firstArr[j])){
                    System.out.printf("%s ", currentWord);
                }
            }
                   }

    }
}
