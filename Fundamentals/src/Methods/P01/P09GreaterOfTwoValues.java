package Methods.P01;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        String type = scanner.nextLine();
        if (type.equals("int")) {
            int first = Integer.parseInt(scanner.nextLine());
            int second = Integer.parseInt(scanner.nextLine());

            result = String.valueOf(getMax(first, second));

        } else if (type.equals("char")) {
            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);

            result = String.valueOf(getMax(first, second));

        } else if (type.equals("string")) {
            String first=scanner.nextLine();
            String second=scanner.nextLine();

            result=getMax(first,second);
        }

        System.out.println(result);
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    private static char getMax(char first, char second) {
        if(first>second){
            return first;
        }
            return second;

    }

    private static String getMax(String first, String second) {
        if(first.compareTo(second)>=0){
            return first;
        };
        return  second;
    }
}
