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

        player.addObserver(new CollisionObserver());
        player.notifyObservers();

        Invoker control = new Invoker();

        Command move = new MoveCommand(player);
        Command attack = new CombatCommand(player);
        System.out.println("Player is alive: " + player.isAlive());

        //switch on
        control.setCommand(move);
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();
        control.pressButton();
        player.notifyObservers();

        player.notifyObservers();


        player.setHostiles(2);
        player.setMode(new AttackMode());

        control.setCommand(attack);
        control.pressButton();
        System.out.println("Player is alive: " + player.isAlive());



    }
}
