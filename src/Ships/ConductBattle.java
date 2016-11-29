package Ships;

public class ConductBattle {
    private CombatMode mode;
    PlayerShip ship;
    public void setCombatMode(CombatMode mode){
        this.mode = mode;
    }

    public void engage(PlayerShip ship, int hostiles){
        mode.battle(ship, hostiles);
    }


}
