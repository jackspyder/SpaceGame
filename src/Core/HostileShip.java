package Core;

import java.util.ArrayList;

public class HostileShip implements Ship, Observable{
    private ArrayList<ShipStatus> myObserver = new <ShipStatus>ArrayList();
    private boolean alive = true;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public void registerObserver(ShipStatus observer) {

        this.myObserver.add(observer);
    }

    @Override
    public void removeObserver(ShipStatus observer) {

        this.myObserver.add(observer);
    }

    @Override
    public void notifyObservers() {

        for(ShipStatus obs : this.myObserver){
            obs.update(alive);
        }
    }
}
