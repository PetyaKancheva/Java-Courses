package Arrays.P02;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <input.length-1 ; i++) {
            int firstNum=input[i];
            for (int j = i; j <input.length-1 ; j++) {
                int secondNum=input[j+1];
                if(firstNum+secondNum==magicNum){
                    System.out.println(firstNum + " "+ secondNum);
                }
            }

        }
    }
}
