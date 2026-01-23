public class Employee extends Component {
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    public String toXml(int indentLevel) {
        return getIndent(indentLevel) + "<employee>\n" + getIndent(indentLevel + 1) + "<name>" + this.name + "</name>\n" + getIndent(indentLevel + 1) + "<salary>" + this.salary + "</salary>\n" + getIndent(indentLevel) + "</employee>\n";
    }
}
