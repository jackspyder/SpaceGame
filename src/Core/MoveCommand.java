package Core;

import Ships.PlayerShip;

public class MoveCommand  implements Command{
    PlayerShip ship;
    public MoveCommand(PlayerShip ship){
        this.ship = ship;
    }

    public void execute(){
        ship.move();
    }
}