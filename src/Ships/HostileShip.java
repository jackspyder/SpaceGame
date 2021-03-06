package Ships;

import Core.Observer;

import java.util.ArrayList;

//Hostile ship class, further ship types are extended from hostile ship. Observer hooks exist for finding position collisions.
public class HostileShip extends Ship {

    private ArrayList<Observer> observers;

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


}
