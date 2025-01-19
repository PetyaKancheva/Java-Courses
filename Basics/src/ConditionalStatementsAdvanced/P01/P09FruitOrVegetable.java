package ConditionalStatementsAdvanced.P01;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();
        String outputWord = "";
        if (inputWord.equals("banana") ||
                inputWord.equals("apple") ||
                inputWord.equals("kiwi") ||
                inputWord.equals("cherry") ||
                inputWord.equals("lemon") ||
                inputWord.equals("grapes")) {
            outputWord = "fruit";
        } else if (inputWord.equals("tomato") ||
                inputWord.equals("cucumber") ||
                inputWord.equals("pepper") ||
                inputWord.equals("carrot")) {
            outputWord = "vegetable";
        } else {
            outputWord = "unknown";
        }
        System.out.println(outputWord);
    }
}
