public class BFactory extends UIFactory{
    @Override
    Element createButton() {
        return new ButtonB();
    }

    @Override
    Element createTextField() {
        return new TextFieldB();
    }

    @Override
    Element createCheckbox() {
        return new CheckboxB();
    }
}
