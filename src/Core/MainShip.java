package Core;

public class MainShip extends Ship implements Observable {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
