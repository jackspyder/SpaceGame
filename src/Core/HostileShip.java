package Core;

public class HostileShip extends Ship implements Observable{

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
