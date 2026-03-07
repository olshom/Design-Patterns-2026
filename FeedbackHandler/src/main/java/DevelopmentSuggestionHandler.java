import java.util.ArrayList;

public class DevelopmentSuggestionHandler extends Handler{
    ArrayList<Message> suggestions = new ArrayList<>();

    @Override
    public void process(Message message) {
        if (message.getType() == Type.DEVELOPMENT_SUGGESTION) {
            suggestions.add(message);
            System.out.println(message.getEmail() + ", thank you for your contribution!");
            System.out.println("Your suggestion is " + suggestions.size() + " in queue.");
        } else {
            super.process(message);
        }
    }
}
