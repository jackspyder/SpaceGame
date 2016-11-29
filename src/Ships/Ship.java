package Ships;

import Core.ShipStatus;

import java.util.ArrayList;

abstract class Ship {
    private ArrayList<ShipStatus> myObserver = new <ShipStatus>ArrayList();
    boolean alive = true;
    protected String shipType;

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }


    public void registerObserver(ShipStatus observer) {

        this.myObserver.add(observer);
    }


    public void removeObserver(ShipStatus observer) {

        this.myObserver.add(observer);
    }


    public void notifyObservers() {

        for(ShipStatus obs : this.myObserver){
            obs.update(alive);
        }
    }

}
