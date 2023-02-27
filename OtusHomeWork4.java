package OtusHomeWork;


import java.util.Arrays;
import java.util.Scanner;

public class OtusHomeWork4 {
    public static void main(String[] args) {
        String[] questions = {"1st question", "2nd question", "3rd question"};
        String[][] answerOptions = {
                {"!!! 1 answer!!!", "2 answer", "3 answer", "4 ans  wer", "5 answer"},
                {"1 answer", "!!! 2 answer!!!", "3 answer"},
                {"1 answer", "2 answer", "!!! 3 answer!!!", "4 answer", "5 answer"}
        };
        Question q1 = new Question(questions);
        Answer answer = new Answer(answerOptions);

        q1.setQuestion(questions);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(q1.getQuestionByI(i));
            System.out.println(Arrays.deepToString(answer.getAnswerByI(i)));


            System.out.println("Введите ответ цифрой от 1 до 5: ");
            boolean check = true;
            Scanner scanner = new Scanner(System.in);
            while (check) {
                if (scanner.hasNextInt()) {
                    int str = scanner.nextInt();
                    if (str == i) {
                        q1.setCorrectCount(q1.getCorrectCount() + 1);
                    } else {
                        q1.setWrongCount(q1.getWrongCount() + 1);
                    }
                    check = false;
                } else {
                    System.out.println("Формат ответа некорректный, введи ответ заново цифрой от 1 до 5: ");
                    scanner.nextLine();
                }
            }
            System.out.println("Результат: правильно " + q1.getCorrectCount() + ", неправильно " + q1.getWrongCount());
        }

    }
}

class Answer {
    public Answer(String[][] answers) {
        this.answers = answers;
    }

    private final String[][] answers;

    public String[] getAnswerByI(int i) {
        return answers[i];
    }

}

class Question {
    public int getCorrectCount() {
        return correctCount;
    }

    private int correctCount = 0;

    public int getWrongCount() {
        return wrongCount;
    }

    private int wrongCount = 0;

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    public void setWrongCount(int wrongCount) {
        this.wrongCount = wrongCount;
    }

    public Question(String[] questions) {
        this.questions = questions;
    }

    private String[] questions;

    public void setQuestion(String[] questions) {
        this.questions = questions;
    }

    public String getQuestionByI(int i) {
        return questions[i];
    }

}









