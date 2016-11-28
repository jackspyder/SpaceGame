package Core;

public interface Observable {
    public void registerObserver(ShipStatus s);
    public void removeObserver(ShipStatus s);
    public void notifyObservers();
}
