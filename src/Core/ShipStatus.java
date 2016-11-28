package Core;

import javax.swing.*;

public class ShipStatus implements Observer, DisplayElement {

    boolean checkAlive;
    private String name = "ship status observer";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void display() {
        String news = "News for " +this.name +"\n";

        news = news + this.checkAlive;

        JOptionPane.showMessageDialog(null, news, "", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void update(boolean alive) {
        this.checkAlive = alive;
        display();
    }


}
