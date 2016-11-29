package Core;

import Ships.CombatMode;
import Ships.PlayerShip;

public class BattleCommand implements Command{
    private CombatMode mode;
    PlayerShip ship;
    public void setCombatMode(CombatMode mode){
        this.mode = mode;
    }

    public void battle(int hostiles){
        mode.battle(hostiles);
    }

    public void execute(){
        ship.battle(CombatMode mode, hostiles);
    }

}
