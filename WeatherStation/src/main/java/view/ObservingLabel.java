package view;

import javafx.application.Platform;
import javafx.scene.control.Label;
import model.WeatherStation;

public class ObservingLabel extends Label implements Observer{

    private WeatherStation observable;

    public ObservingLabel( WeatherStation observable){
        super();
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update() {
        Platform.runLater(() -> this.setText("Temprature: " + observable.getTemperature() + "°C"));
    }
}
