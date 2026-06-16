import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ChatBotGUI<engine> extends JFrame implements ActionListener {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    private ChatBotEngine engine;

    public ChatBotGUI() {

        engine = new ChatBotEngine();

        setTitle("AI ChatBot");
        setSize(550, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Chat Area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(chatArea);

        // Bottom Panel
        JPanel bottomPanel = new JPanel(new BorderLayout());

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 16));

        sendButton = new JButton("Send");
        sendButton.setFont(new Font("Arial", Font.BOLD, 16));

        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        sendButton.addActionListener(this);
        inputField.addActionListener(this);

        chatArea.append("Chat Bot : Hello! I am your AI ChatBot.\n");
        chatArea.append("Chat Bot : Ask me anything about Java, AI, Programming, Date, Time, etc.\n\n");

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String message = inputField.getText().trim();

        if (message.isEmpty())
            return;

        chatArea.append("👤 You : " + message + "\n");

        String response = engine.getResponse(message);

        chatArea.append("Chat Bot : " + response + "\n\n");

        inputField.setText("");
    }
}
