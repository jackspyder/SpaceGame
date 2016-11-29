package Core;

import Ships.PlayerShip;


public class CollisionObserver implements Observer {

    private boolean isCollision = false;

    //if collision is true, combat must commence
    public void combat(){
        System.out.println("init combat");
        isCollision = true;
    }


    //get X/Y coords of playership and check for collision, if true, call combat
    public void update(Object o) {
        if(o instanceof PlayerShip){
            PlayerShip p = (PlayerShip) o;
            int posY = p.getPosY();
            int posX = p.getPosX();
            if((posY==0 || posX==0) && isCollision==false){
                combat();
            }
        }
    }

}
