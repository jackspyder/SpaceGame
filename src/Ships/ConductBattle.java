package Ships;

//Class sets the chosen combat mode then passes on to conduct battle.
public class ConductBattle {
    private CombatMode mode;

    public void setCombatMode(CombatMode mode){
        this.mode = mode;
    }

    public void engage(PlayerShip ship, int hostiles){
        mode.battle(ship, hostiles);
    }


}
