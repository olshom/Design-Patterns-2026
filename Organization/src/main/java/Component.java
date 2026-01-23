public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;

    }

    public abstract int getSalary();

    public abstract String toXml(int indentLevel);

    protected String getIndent(int level) {
        return "  ".repeat(level);
    }

}
