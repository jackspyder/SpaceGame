package Core;

import Ships.PlayerShip;


public class CollisionObserver implements Observer {

    private boolean isCollision = false;

    public void combat(){
        System.out.println("init combat");
        isCollision = true;
    }

//    public void update(Object o) {
//        if(o instanceof Integer){
//            Integer posY = (Integer)o;
//            if(posY==0 && isCollision== false){
//                combat();
//            }
//        }
//    }

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
