package WhileLoop.P02;

import java.util.Scanner;

public class P02ExamPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPoorPoints = Integer.parseInt(scanner.nextLine());
        String inputWord = scanner.nextLine();
        int countPoorGrades = 0;
        int sumScores=0;
        int countProblems=0;
        String  currentProblem="";

        while (!inputWord.equals("Enough")) {
            currentProblem=inputWord;
            int currentGrade = Integer.parseInt(scanner.nextLine());

            if (currentGrade <= 4) {
                countPoorGrades++;
                if (countPoorGrades >= maxPoorPoints) {
                    System.out.printf("You need a break, %d poor grades.", countPoorGrades);
                    return;
                }
            }
            sumScores+=currentGrade;
            countProblems++;

            inputWord = scanner.nextLine();
        }
        System.out.printf("Average score: %.2f%n",sumScores*1.0/countProblems);
        System.out.printf("Number of problems: %d%n",countProblems);
        System.out.printf("Last problem: %s",currentProblem);


    }
}
