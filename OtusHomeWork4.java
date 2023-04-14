package OtusHomeWork;


import java.util.Scanner;

public class OtusHomeWork4 {
    public static void main(String[] args) {
        Test test = new Test();
        test.run();
    }
}
//Внес коррективы в названии переменных
//
class Test {
    private static int correct = 0;
    private static int wrong = 0;
    private final Question[] questions;

    public Test() {
        this.questions = generateQuestions();
    }


    public void run() {
        for (Question question : questions) {
            question.printQuestion();
            ask(question);
        }
        printResult();
    }

    private static void ask(Question question) {
        System.out.println("Введите вариант от 1 до " + question.getLengthOpt() + ": ");
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        while (check) {
            if (scanner.hasNextInt()) {
                int str = scanner.nextInt();
                if (question.isAnswerCorrect(str)) {
                    correct++;
                    check = false;
                } else wrong++;
                check = false;
            } else {
                System.out.println("Формат ответа некорректный, введи ответ заново цифрой от 1 до " + question.getLengthOpt() + ": ");
                scanner.nextLine();
            }

        }
    }

    public void printResult() {
        System.out.println("Результат: правильно " + correct + ", неправильно " + wrong);
    }

    private static Question[] generateQuestions() {

        Question q1 = new Question("1st question", new Option[]{
                new Option(1, "1 answer", true),
                new Option(2, "2 answer", false),
                new Option(3, "3 answer", false),
                new Option(4, "4 answer", false),
                new Option(5, "5 answer", false)});


        Question q2 = new Question("2st question", new Option[]{
                new Option(1, "1 answer", false),
                new Option(2, "2 answer", false),
                new Option(3, "3 answer", false),
                new Option(4, "4 answer", true)});


        Question q3 = new Question("3st question", new Option[]{
                new Option(1, "1 answer", false),
                new Option(2, "2 answer", true),
                new Option(3, "3 answer", false)});


        Question q4 = new Question("4st question", new Option[]{
                new Option(1, "1 answer", false),
                new Option(2, "2 answer", true),
                new Option(3, "3 answer", false),
                new Option(4, "4 answer", false)});


        return new Question[]{q1, q2, q3, q4};
    }

}

class Option {
    private final int number;
    private final String text;
    public final boolean isCorrectOption;


    public Option(int number, String text, boolean isCorrectOption) {
        this.number = number;
        this.text = text;
        this.isCorrectOption = isCorrectOption;
    }

    public void printOption() {
        System.out.println(number + ". " + text);
    }
}

class Question {

    private final String text;
    private final Option[] options;


    public Question(String text, Option[] options) {
        this.text = text;
        this.options = options;
    }

    public void printQuestion() {
        System.out.println(text + ": ");
        for (Option option : options) {
            option.printOption();
        }
    }

    public int getLengthOpt() {
        return options.length;
    }


    public boolean isAnswerCorrect(int answerNumber) {
        if (answerNumber > 0 && answerNumber <= options.length) {
            return this.options[answerNumber - 1].isCorrectOption;
        }
        return false;
    }

}











