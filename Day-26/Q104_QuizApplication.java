import java.util.Scanner;

public class Q104_QuizApplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] questions = new String[5];
        String[] answers = new String[5];

        questions[0] = "What is the capital of India?";
        answers[0] = "delhi";

        questions[1] = "Which language runs on JVM?";
        answers[1] = "java";

        questions[2] = "What is 5 + 3?";
        answers[2] = "8";

        questions[3] = "Who developed Java?";
        answers[3] = "james gosling";

        questions[4] = "What does CPU stand for?";
        answers[4] = "central processing unit";

        int score = 0;

        for (int i = 0; i < questions.length; i++)
        {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            String userAnswer = sc.nextLine();

            if (userAnswer.trim().equalsIgnoreCase(answers[i]))
            {
                System.out.println("Correct!");
                score++;
            }
            else
            {
                System.out.println("Wrong! Correct answer: " + answers[i]);
            }
        }

        System.out.println("Quiz Over!");
        System.out.println("Your Score: " + score + " out of " + questions.length);

        sc.close();
    }
}