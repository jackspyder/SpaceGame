package Core;

//observable interface used for observer pattern.
public interface Observable {
    public void notifyObservers();
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
}
