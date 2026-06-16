import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NLPProcessor {

    // Common stop words
    private static final List<String> STOP_WORDS = Arrays.asList(
            "is", "am", "are", "the", "a", "an", "to", "of",
            "for", "please", "can", "could", "you", "me",
            "tell", "about", "what", "who", "how"
    );

    // Clean user input
    public String preprocess(String input) {

        input = input.toLowerCase();

        // Remove punctuation
        input = input.replaceAll("[^a-zA-Z0-9 ]", "");

        // Remove extra spaces
        input = input.replaceAll("\\s+", " ").trim();

        return input;
    }

    // Tokenize sentence
    public List<String> tokenize(String input) {

        input = preprocess(input);

        String[] words = input.split(" ");

        return new ArrayList<>(Arrays.asList(words));
    }

    // Remove stop words
    public List<String> removeStopWords(List<String> words) {

        List<String> filtered = new ArrayList<>();

        for (String word : words) {

            if (!STOP_WORDS.contains(word)) {
                filtered.add(word);
            }

        }

        return filtered;
    }

    // Final processed keywords
    public List<String> extractKeywords(String input) {

        List<String> tokens = tokenize(input);

        return removeStopWords(tokens);
    }

}
