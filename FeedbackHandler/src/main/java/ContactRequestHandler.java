public class ContactRequestHandler extends Handler{

    @Override
    public void process(Message message) {
        if (message.getType() == Type.CONTACT_REQUEST) {
            System.out.println(message.getEmail() + ", your contact request has been forwarded to the relevant department.");
        } else {
            super.process(message);
        }
    }
}
