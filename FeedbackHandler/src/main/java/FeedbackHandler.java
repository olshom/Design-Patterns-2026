public class FeedbackHandler extends Handler{
    @Override
    public void process(Message message) {
        if (message.getType() == Type.GENERAL_FEEDBACK) {
            System.out.println(message.getEmail() + ", thank you for your feedback!");
        } else {
            super.process(message);
        }
    }
}
