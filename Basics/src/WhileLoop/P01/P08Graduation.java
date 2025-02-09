package WhileLoop.P01;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName=scanner.nextLine();

        double sumGrades=0;
        int year=0;
        while(year<12){
          double  currentGrade=Double.parseDouble(scanner.nextLine());
            year++;
                int failedGrade=0;
                while(currentGrade<4){
                    failedGrade++;
                    if(failedGrade>1){
                        System.out.printf("%s has been excluded at %d grade",studentName,year);
                        return;
                    }
                    currentGrade=Double.parseDouble(scanner.nextLine());
                }

                sumGrades+=currentGrade;


        }

        System.out.printf("%s graduated. Average grade: %.2f",studentName,sumGrades/12);
    }
}
