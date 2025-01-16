import java.util.ArrayList;
import java.util.Scanner;


class Question {
    private String questionText;
    private String[] options;
    private int correctAnswer;

   
    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

   
    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}


class Quiz {
    private ArrayList<Question> questions;
    private int score;
    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }
    public void addQuestion(Question question) {
        questions.add(question);
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz!");
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.getQuestionText());
            String[] options = q.getOptions();

            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }

            System.out.print("Your answer (choose the option number): ");
            int answer = scanner.nextInt();

            if (answer == q.getCorrectAnswer()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + q.getCorrectAnswer());
            }
            System.out.println();
        }

        System.out.println("Quiz finished! Your total score is: " + score + "/" + questions.size());
        scanner.close();
    }
}
public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question(
            "What is the capital of France?",
            new String[]{"Berlin", "Madrid", "Paris", "Rome"},
            3 
        ));
        quiz.addQuestion(new Question(
            "What is 5 + 3?",
            new String[]{"5", "8", "10", "15"},
            2 
        ));
        quiz.addQuestion(new Question(
            "Which programming language is known as platform-independent?",
            new String[]{"C", "Python", "Java", "C++"},
            3 
        ));
        quiz.start();
    }
}
