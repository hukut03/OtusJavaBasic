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
        var questions1 = q1.questions;

        for (int i = 0; i < questions1.length; i++) {
            q1.printQuestion();
            answer.printAnswers();
//            System.out.println(Arrays.toString(answer.getAnswerByI(i)));
            System.out.println("Введите ответ цифрой от 1 до 5: ");
            boolean check = true;
            Scanner scanner = new Scanner(System.in);
            while (check) {
                if (scanner.hasNextInt()) {
                    int str = scanner.nextInt();
                    if (str == q1.getCorrectCount()) {
                        q1.getCorrectCount();
                        check = false;
                    } else {
                        q1.getWrongCount();
                        check = false;
                    }
                } else {
                    System.out.println("Формат ответа некорректный, введи ответ заново цифрой от 1 до 5: ");
                    scanner.nextLine();
                }
            }
            System.out.println("Результат: правильно " + q1.getCorrectCount() + ", неправильно " + q1.getWrongCount());
        }

    }

    /**/


    private static class Answer {
        public Answer(String[][] answers) {
            this.answers = answers;
        }

        private String[][] answers;

        private void setAnswer(String[][] answers) {
            this.answers = answers;
        }

        private String[][] getAnswers() {
            return answers;
        }

        private String[] getAnswerByI(int i) {
            return answers[i];
        }

        private void printAnswers() {
            for (int i = 0; i < answers.length; i++) {
                System.out.println(Arrays.toString(answers[i]));

            }
        }

    }

    private static class Question {
        public int getCorrectCount() {
            return correctCount;
        }

        private int correctCount;

        public int getWrongCount() {
            return wrongCount;
        }

        private int wrongCount;

        public Question(String[] questions) {
            this.questions = questions;
        }

        private String[] questions;

        private void setQuestion(String[] questions) {
            this.questions = questions;
        }

        private String[] getQuestion() {
            return questions;
        }

        private String getQuestionByI(int i) {
            return questions[i];
        }

        private void printQuestion() {
            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);

            }
        }

    }

    private class PossibleAnswers {

        private String[][] answerOptions = {
                {"!!! 1 answer!!!", "2 answer", "3 answer", "4 answer", "5 answer"},
                {"1 answer", "!!! 2 answer!!!", "3 answer"},
                {"1 answer", "2 answer", "!!! 3 answer!!!", "4 answer", "5 answer"}
        };
    }

//    boolean check = true;// переключатель, который нужен что бы выходить из и переходить к след вопросу
//    int[] correctAnswers = {1, 2, 3, 4, 5};
//            Scanner scanner = new Scanner(System.in);
//            while (check) {
//                if (scanner.hasNextInt()) {
//                    int str = scanner.nextInt();
//                    if (str == correctAnswers[i]) {
//                        correctCount++;
//                        check = false;
//                    } else {
//                        wrongCount++;
//                        check = false;
//                    }
//                } else {
//                    System.out.println("Формат ответа некорректный, введи ответ заново цифрой от 1 до 5: ");
//                    scanner.nextLine();

}




