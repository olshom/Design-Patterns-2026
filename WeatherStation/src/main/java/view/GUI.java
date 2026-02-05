package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.WeatherStation;

public class GUI extends Application {
    private WeatherStation weatherStation = new WeatherStation();

    @Override
    public void start(Stage primaryStage) {
        Thread station = new Thread(weatherStation);
        station.start();

        openWindow("The weather1");
        openWindow("The weather2");
        openWindow("The weather3");
    }

    public void openWindow(String windowName) {
        Stage stage = new Stage();
        stage.setTitle(windowName);

       Label label = new ObservingLabel(weatherStation );

        //Label label = new Label(String.valueOf(weatherStation.getTemperature()));

        VBox root = new VBox(label);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}
