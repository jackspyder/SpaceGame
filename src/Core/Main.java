package Core;

import Ships.*;
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

        ShipFactory factory = new ShipFactory();
        PlayerShip player = new PlayerShip();
        System.out.println("Ship is of type: " + player.getShipType());

        Invoker control = new Invoker();

        Command move = new MoveCommand(player);
        Command attack = new CombatCommand(player);


        //switch on
        control.setCommand(move);
        control.pressButton();
        //switch off

        player.setHostiles(3);
        player.setMode(new DefenceMode());

        control.setCommand(attack);
        control.pressButton();


    }
}
