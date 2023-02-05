package OtusHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class OtusHomeWork3 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;

        String[] questions = {"1st question", "2nd question", "3rd question"};

        String[][] answerOptions = {
                {"!!! 1 answer!!!", "2 answer", "3 answer", "4 answer", "5 answer"},
                {"1 answer", "!!! 2 answer!!!", "3 answer"},
                {"1 answer", "2 answer", "!!! 3 answer!!!", "4 answer", "5 answer"}
        };
        int[] correctAnswers = {1, 2, 3, 4, 5};

        System.out.println(questions[0]);
        System.out.println(Arrays.toString(answerOptions[0]));
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        if (str==(correctAnswers[0])) {
            correctCount++;
        } else wrongCount++;


        System.out.println(questions[1]);
        System.out.println(Arrays.toString(answerOptions[1]));
        Scanner scanner1 = new Scanner(System.in);
        int str1 = scanner.nextInt();
        if (str1==(correctAnswers[1])) {
            correctCount++;
        } else wrongCount++;

        System.out.println(questions[2]);
        System.out.println(Arrays.toString(answerOptions[2]));
        Scanner scanner2 = new Scanner(System.in);
        int str2 = scanner.nextInt();
        if (str2==(correctAnswers[2])) {
            correctCount++;
        } else wrongCount++;

        System.out.println();
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}