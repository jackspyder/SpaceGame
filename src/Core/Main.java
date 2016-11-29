package Core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../GUI/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        //launch(args);

        HostileShip bad = new HostileShip();
        bad.setName("baddy");
        MainShip player = new MainShip();
        player.setName("Jack");

        ShipStatus view = new ShipStatus();

        bad.registerObserver(view);
        player.registerObserver(view);

        bad.notifyObservers();
        player.notifyObservers();

        bad.setAlive(false);
        player.setAlive(false);
        bad.notifyObservers();
        player.notifyObservers();


    }
}
