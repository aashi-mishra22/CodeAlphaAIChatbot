import java.util.Random;

public class ResponseDatabase {

    private static Random random = new Random();

    // Greeting Responses
    private static String[] greetings = {

            "Hello!  How can I help you today?",

            "Hi! Nice to meet you.",

            "Hey! Hope you're having a great day.",

            "Hello there! Ask me anything.",

            "Hi! I'm your AI ChatBot."
    };

    // Joke Responses
    private static String[] jokes = {

            "Why do programmers prefer dark mode? Because light attracts bugs!",

            "Why do Java developers wear glasses? Because they don't C#.",

            "Debugging is like being a detective in a crime movie where you're also the criminal.",

            "Why was the computer cold? It left its Windows open!",

            "A SQL query walks into a bar and joins two tables."
    };

    // Default Responses
    private static String[] defaults = {

            "Sorry, I couldn't understand your question.",

            "Can you rephrase your question?",

            "I'm still learning. Please ask something else.",

            "Interesting! Could you explain a little more?",

            "I don't have an answer for that yet."
    };

    public static String getGreeting() {

        return greetings[random.nextInt(greetings.length)];

    }

    public static String getJoke() {

        return jokes[random.nextInt(jokes.length)];

    }

    public static String getDefaultResponse() {

        return defaults[random.nextInt(defaults.length)];

    }

}
