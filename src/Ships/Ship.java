package Ships;

abstract class Ship {



    private String shipType;
    private boolean alive = true;
    private int posX;
    private int posY;


    //Movement Commands o,o top left

    //up y-1, down y+1, left x-1, right x+1, up right y-1 x+1, up left y-1 x-1, down right y+1 x+1, down left y+1 x-1.


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

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() { return posX; }

    public void setPosX(int posX) {
        this.posX = posX;
    }
}
