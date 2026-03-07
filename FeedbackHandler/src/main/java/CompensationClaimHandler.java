public class CompensationClaimHandler extends Handler {

    @Override
    public void process(Message message) {
        if (message.getType() == Type.COMPENSATION_CLAIM) {
            boolean approved = Math.random() < 0.5;
            System.out.println(message.getEmail() + ", your compensation claim has been " + (approved ? "approved" : "rejected") + ".");
        } else {
            super.process(message);
        }
    }
}
