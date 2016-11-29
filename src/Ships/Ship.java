package Ships;

import java.util.ArrayList;
import java.util.Random;

abstract class Ship {


    private String shipType;
    private boolean alive = true;
    private int posX = 2;
    private int posY = 2;


    public void move() {

        int index = (int) (Math.random() * 7);
        System.out.println("index is: " + index);
        System.out.println("Ship Moved from: " + getPosX() + " " + getPosY());
        switch (index) {
            case 1:
                up(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 2:

                down(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 3:

                left(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 4:

                right(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 5:

                upLeft(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 6:

                upRight(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 7:

                downLeft(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());
                break;
            case 8:

                downRight(posX, posY);
                System.out.println("Ship Moved to: " + getPosX() + " " + getPosY());

                break;
            default:
                break;

        }


    }


    //Movement Commands o,o top left

    // down right y+1 x+1,

    private void up(int posX, int posY) {
        if (posY - 1 >= 0) {
            setPosY(posY - 1);
        }
    }

    private void down(int posX, int posY) {
        if (posY + 1 < 4) {
            setPosY(posY + 1);
        }
    }

    private void left(int posX, int posY) {
        if (posX - 1 >= 0) {
            setPosX(posX - 1);
        }
    }

    private void right(int posX, int posY) {
        if (posX + 1 < 4) {
            setPosX(posX + 1);
        }
    }

    private void upLeft(int posX, int posY) {
        if ((posY - 1 >= 0) && (posX - 1 >= 0)) {
            setPosY(posY - 1);
            setPosX(posX - 1);
        }
    }

    private void upRight(int posX, int posY) {
        if ((posY - 1 >= 0) && (posX + 1 < 4)) {
            setPosY(posY - 1);
            setPosX(posX + 1);
        }
    }

    private void downLeft(int posX, int posY) {
        if ((posY + 1 < 4) && (posX - 1 >= 0)) {
            setPosY(posY + 1);
            setPosX(posX - 1);
        }
    }

    private void downRight(int posX, int posY) {
        if ((posY + 1 < 4) && (posX + 1 < 4)) {
            setPosY(posY + 1);
            setPosX(posX + 1);
        }
    }


    //Getters and Setters

    public String getShipType() {
        return shipType;
    }

    protected void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }


    public int getPosY() {
        return posY;
    }

    private void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    private void setPosX(int posX) {
        this.posX = posX;
    }
}
