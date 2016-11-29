package Ships;

public class ConductBattle {
    private CombatMode mode;
    PlayerShip ship;
    public void setCombatMode(CombatMode mode){
        this.mode = mode;
    }

    public void engage(int hostiles){
        mode.battle(hostiles);
    }

//    public void execute(){
//        ship.battle();
//    }

}
