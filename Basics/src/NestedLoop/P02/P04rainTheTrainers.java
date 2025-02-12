package NestedLoop.P02;

import java.util.Scanner;

public class P04rainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberReviews=Integer.parseInt(scanner.nextLine());
        String input= scanner.nextLine();
                double totalAverageGrade=0;
                int countTests=0;
        while(!input.equals("Finish")){
                String testName=input;
                countTests++;
            double currentAverageGrade=0;
            for (int i = 1; i <=numberReviews ; i++) {
                double currentGrade=Double.parseDouble(scanner.nextLine());
                currentAverageGrade+=currentGrade;
                totalAverageGrade+=currentGrade;
            }
            currentAverageGrade/=numberReviews;
            System.out.printf("%s - %.2f.%n",testName,currentAverageGrade);

            input=scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",totalAverageGrade/(countTests *numberReviews));
    }
}
