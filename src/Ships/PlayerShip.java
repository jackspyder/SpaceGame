package Ships;


import Core.Observable;
import Core.Observer;

import java.util.ArrayList;

//Observable Player ship, extended from Ship.
public class PlayerShip extends Ship implements Observable{


    private CombatMode mode;
    private int hostiles;
    public PlayerShip(){
        setShipType("Player");
    }

    //store observers
    private ArrayList<Observer> observers = new ArrayList<>();

    //notify observers of changes
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }



    //passes parameters for conducting a battle including mode and # of hostiles within the grid.
    public void battle(){
        ConductBattle conductBattle = new ConductBattle();
        conductBattle.setCombatMode(mode);

        conductBattle.engage(this, hostiles);
    }


    //getters and setters

    public CombatMode getMode() {
        return mode;
    }

    public void setMode(CombatMode mode) {
        this.mode = mode;
        System.out.println("Mode set to " + mode.toString());
    }

    public int getHostiles() {
        return hostiles;
    }

    public void setHostiles(int hostiles) {
        this.hostiles = hostiles;
    }
}
