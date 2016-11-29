package Core;

import Ships.AttackMode;
import Ships.CombatMode;
import Ships.PlayerShip;

public class CombatCommand implements Command{
    PlayerShip ship;
    public CombatCommand(PlayerShip ship){
        this.ship = ship;
    }

    public void execute(){
        ship.battle();
    }

}
