package Core;

public class MainShip implements Ship, Observable {
    private boolean alive = true;


    @Override
    public void registerObserver(ShipStatus s) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public void removeObserver(ShipStatus s) {

    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
