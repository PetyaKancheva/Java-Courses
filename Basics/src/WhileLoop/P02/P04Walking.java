package WhileLoop.P02;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;

        while (totalSteps<=10000){
            String input=scanner.nextLine();

            if(input.equals("Going home")){
                int lastSteps=Integer.parseInt(scanner.nextLine());
                totalSteps+=lastSteps;
                    break;
            }else{
                int currentSteps=Integer.parseInt(input);
                totalSteps+=currentSteps;
            }

        }
        if(totalSteps>10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",(totalSteps-10000) );
        }else{
            System.out.printf("%d more steps to reach goal.",10000-totalSteps);
        }

    }
}
