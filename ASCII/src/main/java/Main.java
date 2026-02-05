public class Main {
    public static void main(String[] args) {
        UIFactory myFactory = new AFactory();
        //UIFactory myFactory = new BFactory();
        Element button = myFactory.createButton();
        button.setText("button");
        Element textField= myFactory.createTextField();
        textField.setText("textfield");
        Element checkBox = myFactory.createCheckbox();
        checkBox.setText("checkbox");
        System.out.println("");
        textField.display();
        System.out.println("");
        checkBox.display();
        System.out.println("");
        button.display();
    }
}
