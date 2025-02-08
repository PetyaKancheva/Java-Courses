package ForLoop.P01;

    import java.util.Scanner;

    public class P08NumberSequence {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countIterations = Integer.parseInt(scanner.nextLine());

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= countIterations; i++) {
                int inputNum = Integer.parseInt(scanner.nextLine());
                if (inputNum>max){
                    max=inputNum;
                }
                if(inputNum<min){
                    min=inputNum;
                }
            }


            System.out.printf("Max number: %d%n", max);
            System.out.printf("Min number: %d", min);
        }
    }
