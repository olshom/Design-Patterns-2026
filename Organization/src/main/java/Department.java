import java.util.ArrayList;

public class Department extends Component {
    ArrayList<Component> components;

    public Department(String name) {
        super(name);
        components = new ArrayList<>();
    }

    @Override
    public int getSalary() {
        int totalSalary = 0;
        for (Component component : components) {
            totalSalary += component.getSalary();
        }
        return totalSalary;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public String toXml(int indentLevel) {
        StringBuilder xml = new StringBuilder();
        xml
                .append(getIndent(indentLevel))
                .append("<department>\n")
                .append(getIndent(indentLevel + 1))
                .append("<name>")
                .append(name)
                .append("</name>\n")
                .append(getIndent(indentLevel + 1))
                .append("<salary>")
                .append(getSalary())
                .append("</salary>\n");

        for (Component component : components) {
            xml.append(component.toXml(indentLevel + 1));
        }

        xml.append(getIndent(indentLevel))
                .append("</department>\n");
        return xml.toString();
    }

}
