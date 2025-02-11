package NestedLoop.P02;

    import java.util.Scanner;

    public class P02EqualSumsEvenOddPosition {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int firstNum=Integer.parseInt(scanner.nextLine());
            int  secondNum=Integer.parseInt(scanner.nextLine());
            for (int i = firstNum; i <=secondNum ; i++) {
                    int currentNum=i;
                    int evenSum=0;
                    int oddSum=0;
                for (int j = 0; j <6 ; j++) {
                        int currentDigit=currentNum%10;
                                currentNum=currentNum/10;
                     if(j%2==0){
                         evenSum+=currentDigit;
                     }else{
                         oddSum+=currentDigit;
                     }
                }

                if(evenSum==oddSum){
                    System.out.printf("%d ",i);
                }
            }
        }
    }
