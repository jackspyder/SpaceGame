package Ships;

import java.util.Random;

//Primary ship class all ships are inherited from.
abstract class Ship {


    //basic variables to determine type, alive status and position.
    private String shipType;
    private boolean alive = true;
    private int posX = 0;
    private int posY = 0;


//routine to conduct a random directional move ensuring moves are valid and within the appropriate grid space
    public void move() {

        //randomise movement direction.
        Random rn = new Random();
        int index = rn.nextInt(8) + 1;
        System.out.println("index is: " + index);
        System.out.println(this.getShipType() + " ship moved from: " + getPosX() + " " + getPosY());
        //switch statement executes with randomised index.
        switch (index) {
            case 1:
                up(posX, posY);
                break;
            case 2:
                down(posX, posY);
                break;
            case 3:
                left(posX, posY);
                break;
            case 4:
                right(posX, posY);
                break;
            case 5:
                upLeft(posX, posY);
                break;
            case 6:
                upRight(posX, posY);
                break;
            case 7:
                downLeft(posX, posY);
                break;
            case 8:
                downRight(posX, posY);
                break;
            default:
                break;
        }
    }


    //Movement Commands o,o top left, 0,0 is only accessible during "spawn" or creation.

    private void up(int posX, int posY) {
        if (posY - 1 >= 1) {
            setPosY(posY - 1);
            getLocation();
        } else {
            move();
        }
    }

    private void down(int posX, int posY) {
        if (posY + 1 < 4) {
            setPosY(posY + 1);
            getLocation();
        } else {
            move();
        }
    }

    private void left(int posX, int posY) {
        if (posX - 1 >= 1) {
            setPosX(posX - 1);
            getLocation();
        } else {
            move();
        }
    }

    private void right(int posX, int posY) {
        if (posX + 1 < 4) {
            setPosX(posX + 1);
            getLocation();
        } else {
            move();
        }
    }

    private void upLeft(int posX, int posY) {
        if ((posY - 1 >= 1) && (posX - 1 >= 1)) {
            setPosY(posY - 1);
            setPosX(posX - 1);
            getLocation();
        } else {
            move();
        }
    }

    private void upRight(int posX, int posY) {
        if ((posY - 1 >= 1) && (posX + 1 < 4)) {
            setPosY(posY - 1);
            setPosX(posX + 1);
            getLocation();
        } else {
            move();
        }
    }

    private void downLeft(int posX, int posY) {
        if ((posY + 1 < 4) && (posX - 1 >= 1)) {
            setPosY(posY + 1);
            setPosX(posX - 1);
            getLocation();
        } else {
            move();
        }
    }

    private void downRight(int posX, int posY) {
        if ((posY + 1 < 4) && (posX + 1 < 4)) {
            setPosY(posY + 1);
            setPosX(posX + 1);
            getLocation();
        } else {
            move();
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

    public void getLocation() {

        System.out.println(this.getShipType() + " ship moved to: " + getPosX() + " " + getPosY());

    }

}
