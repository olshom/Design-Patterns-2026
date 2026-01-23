public class Main {
    public static void main(String[] args) {
        Department organization = new Department("Organization");

        Department department1 = new Department("IT");
        Department department2 = new Department("Electronics");
        Department department3 = new Department("Management");

        Component e1 = new Employee("Employee1", 3000);
        Component e2 = new Employee("Employee2", 3200);
        Component e3 = new Employee("Employee3", 3400);
        Component e4 = new Employee("Employee4", 3600);
        Component e5 = new Employee("Employee5", 3800);

        Component e6 = new Employee("Employee6", 4000);
        Component e7 = new Employee("Employee7", 4200);
        Component e8 = new Employee("Employee8", 4400);
        Component e9 = new Employee("Employee9", 4600);
        Component e10 = new Employee("Employee10", 4800);

        Component e11 = new Employee("Employee11", 5000);
        Component e12 = new Employee("Employee12", 5200);
        Component e13 = new Employee("Employee13", 5400);
        Component e14 = new Employee("Employee14", 5600);
        Component e15 = new Employee("Employee15", 5800);

        department1.add(e1);
        department1.add(e2);
        department1.add(e3);
        department1.add(e4);
        department1.add(e5);
        department2.add(e6);
        department2.add(e7);
        department2.add(e8);
        department2.add(e9);
        department2.add(e10);
        department3.add(e11);
        department3.add(e12);
        department3.add(e13);
        department3.add(e14);
        department3.add(e15);
        organization.add(department1);
        organization.add(department2);
        organization.add(department3);

        System.out.println(department1.getSalary());
        System.out.println(department2.getSalary());
        System.out.println(department3.getSalary());
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        System.out.println(organization.toXml(0));

    }
}
