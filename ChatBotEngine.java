import java.util.List;

public class ChatBotEngine {

    private NLPProcessor nlpProcessor;
    private RuleEngine ruleEngine;

    public ChatBotEngine() {
        nlpProcessor = new NLPProcessor();
        ruleEngine = new RuleEngine();
    }

    public String getResponse(String userInput) {

        // Check empty input
        if (userInput == null || userInput.trim().isEmpty()) {
            return "Please type something.";
        }

        // NLP Processing
        List<String> keywords = nlpProcessor.extractKeywords(userInput);

        // Rule-based response
        return ruleEngine.getRuleResponse(keywords);
    }
}
