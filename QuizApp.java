import java.util.*;

class Question {
    String questionText;
    List<String> options;
    int correctAnswer; // index of correct option (1-based)

    
    Question(String questionText, List<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

   
    void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    
    boolean isCorrect(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a list of questions
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Which language is used for Android development?",
                Arrays.asList("Python", "C#", "Java", "PHP"),
                3
        ));

        questions.add(new Question(
                "Which company developed Java?",
                Arrays.asList("Microsoft", "Sun Microsystems", "Google", "Apple"),
                2
        ));

        questions.add(new Question(
                "Which data structure uses FIFO (First In, First Out)?",
                Arrays.asList("Stack", "Queue", "Tree", "Graph"),
                2
        ));

        questions.add(new Question(
                "Which of these is not an OOP concept?",
                Arrays.asList("Encapsulation", "Polymorphism", "Compilation", "Inheritance"),
                3
        ));

        questions.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                Arrays.asList("extends", "implements", "inherit", "super"),
                1
        ));

        questions.add(new Question(
                "Who is known as the father of computers?",
                Arrays.asList("Alan Turing", "Charles Babbage", "Dennis Ritchie", "James Gosling"),
                2
        ));

        questions.add(new Question(
                "Which symbol is used to start a single-line comment in Java?",
                Arrays.asList("//", "/*", "#", "<!--"),
                1
        ));

        questions.add(new Question(
                "Which of these is a valid access modifier in Java?",
                Arrays.asList("public", "default", "private", "All of the above"),
                4
        ));

        questions.add(new Question(
                "Which method is the entry point of any Java program?",
                Arrays.asList("start()", "main()", "run()", "init()"),
                2
        ));

        questions.add(new Question(
                "Which collection class allows key-value pairs in Java?",
                Arrays.asList("List", "Set", "Map", "Queue"),
                3
        ));

        int score = 0;

        System.out.println("===== Welcome to the Online Quiz App =====");
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ": ");
            q.displayQuestion();

            System.out.print("Enter your answer (1-" + q.options.size() + "): ");
            int userAnswer = sc.nextInt();

            if (q.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct Answer: " + q.correctAnswer + ". " + q.options.get(q.correctAnswer - 1));
            }
        }

        System.out.println("\n===== Quiz Over! =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}
