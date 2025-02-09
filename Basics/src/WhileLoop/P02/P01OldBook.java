package WhileLoop.P02;

import java.util.Scanner;

public class P01OldBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookToFind= scanner.nextLine();
        String currentBook=scanner.nextLine();
        int count=0;
        while(!currentBook.equals("No More Books")){

             if (bookToFind.equals(currentBook)){
                 System.out.printf("You checked %d books and found it.",count  );
                 return;
             }
            count++;
            currentBook=scanner.nextLine();
        }

        System.out.printf("The book you search is not here!%n");
        System.out.printf("You checked %d books.",count);

    }
}
