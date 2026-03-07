public abstract class Handler {
    private Handler next;

    public void process(Message message) {
        if (next != null) {
            next.process(message);
        }
    }

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }
}
