package Arrays.P01;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[]secondArray= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n=firstArray.length;
        boolean isEqual=true;

        for (int i = 0; i <n ; i++) {
            if(firstArray[i]!=secondArray[i]){
                isEqual=false;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }
         if(isEqual){
             //calc sum
             int sum = Arrays.stream(firstArray).sum();
             System.out.printf("Arrays are identical. Sum: %d",sum);
         }
    }
}
