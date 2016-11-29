package Core;

import Ships.PlayerShip;

//command to conduct a ship movement used in command pattern.
public class MoveCommand  implements Command{
    PlayerShip ship;
    public MoveCommand(PlayerShip ship){
        this.ship = ship;
    }

    public void execute(){
        ship.move();
    }
}