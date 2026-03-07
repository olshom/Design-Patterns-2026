public class Main {
    public static void main(String[] args) {
        Handler chain = new FeedbackHandler();
        chain.setNext(new ContactRequestHandler())
             .setNext(new DevelopmentSuggestionHandler())
             .setNext(new CompensationClaimHandler());

        chain.process(new Message("I demand compensation!", "alice@example.com", Type.COMPENSATION_CLAIM));
        chain.process(new Message("Please contact me.", "bob@example.com", Type.CONTACT_REQUEST));
        chain.process(new Message("Add dark mode please.", "carol@example.com", Type.DEVELOPMENT_SUGGESTION));
        chain.process(new Message("Great service overall.", "dave@example.com", Type.GENERAL_FEEDBACK));
    }
}
