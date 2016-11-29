package Ships;


import Core.Observable;
import Core.Observer;

import java.util.ArrayList;

public class PlayerShip extends Ship implements Observable{

    CombatMode mode;
    private int hostiles;
    public PlayerShip(){
        setShipType("Player");
    }

    private ArrayList<Observer> observers = new ArrayList<>();

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
