public class AFactory extends UIFactory{

    @Override
    Element createButton() {
        return new ButtonA();
    }

    @Override
    Element createTextField() {
        return new TextFieldA();
    }

    @Override
    Element createCheckbox() {
        return new CheckboxA();
    }
}
