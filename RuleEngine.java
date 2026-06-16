import java.util.List;

public class RuleEngine {

    public String getRuleResponse(List<String> words) {

        // Greetings
        if (words.contains("hi") ||
                words.contains("hello") ||
                words.contains("hey")) {

            return ResponseDatabase.getGreeting();
        }

        // Java
        if (words.contains("java")) {

            return "Java is a powerful Object-Oriented Programming language developed by James Gosling.";
        }

        // Python
        if (words.contains("python")) {

            return "Python is widely used in AI, Machine Learning, Data Science and Web Development.";
        }

        // AI
        if (words.contains("ai") ||
                words.contains("artificial") ||
                words.contains("intelligence")) {

            return "Artificial Intelligence enables computers to perform tasks that normally require human intelligence.";
        }

        // Machine Learning
        if (words.contains("machine") ||
                words.contains("learning")) {

            return "Machine Learning is a branch of AI that learns patterns from data.";
        }

        // Chatbot
        if (words.contains("chatbot")) {

            return "A chatbot communicates with users using predefined rules or AI models.";
        }

        // Programming
        if (words.contains("programming") ||
                words.contains("coding")) {

            return "Programming is the process of writing instructions for computers.";
        }

        // College
        if (words.contains("college")) {

            return "Practice coding daily to improve your programming skills.";
        }

        // Internship
        if (words.contains("internship")) {

            return "Internships help you gain real-world experience and strengthen your resume.";
        }

        // GitHub
        if (words.contains("github")) {

            return "GitHub is a platform used to host and manage software projects using Git.";
        }

        // DSA
        if (words.contains("dsa")) {

            return "Data Structures and Algorithms are essential for coding interviews.";
        }

        // Joke
        if (words.contains("joke")) {

            return ResponseDatabase.getJoke();
        }

        // Date
        if (words.contains("date")) {

            return Utils.getCurrentDate();
        }

        // Time
        if (words.contains("time")) {

            return Utils.getCurrentTime();
        }

        // Thanks
        if (words.contains("thanks") ||
                words.contains("thank") ||
            words.contains("thank you")) {

            return "You're welcome!";
        }

        // Bye
        if (words.contains("bye")) {

            return "Goodbye! Have a wonderful day.";
        }

        // Default
        return ResponseDatabase.getDefaultResponse();

    }

}
