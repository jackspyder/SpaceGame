package Core;

public interface Observable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

    public Object getUpdate(Observer o);
}
