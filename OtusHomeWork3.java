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

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[j].length; j++) {
                System.out.println(Arrays.toString(answerOptions[i]));
                break;
            }
            System.out.println("Введите ответ цифрой от 1 до 5: ");

            boolean check = true;// переключатель, который нужен что бы выходить из и переходить к след вопросу

            Scanner scanner = new Scanner(System.in);
            while (check) {
                if (scanner.hasNextInt()) {
                    int str = scanner.nextInt();
                    if (str == correctAnswers[i]) {
                        correctCount++;
                        check = false;
                    } else {
                        wrongCount++;
                        check = false;
                    }
                } else {
                    System.out.println("Формат ответа некорректный, введи ответ заново цифрой от 1 до 5: ");
                    scanner.nextLine();
                }
            }
            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
        }
    }
}

