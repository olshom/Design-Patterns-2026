public class Message{
    private String content;
    private Type type;
    private String email;
    public Message(String content, String email, Type type) {
        this.content = content;
        this.email = email;
        this.type = type;
    }

    public String getContent() {
        return content;
    }
    public String getEmail() {
        return email;
    }
    public Type getType() {
        return type;
    }
}
