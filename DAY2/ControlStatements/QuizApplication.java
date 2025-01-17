import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the largest ocean on Earth?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the square root of 64?"
        };
        String[] answers = {
            "Paris",
            "Mars",
            "Pacific",
            "Shakespeare",
            "8"
        };

        int score = 0;

        System.out.println("Welcome to the Quiz!\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Over!");
        System.out.println("Your total score: " + score + "/" + questions.length);

        scanner.close();
    }
}
