package Ships;

public class PlayerShip extends Ship {

    CombatMode mode;
    private int hostiles;
    public PlayerShip(){
        setShipType("Player");
    }




    public void battle(){
        ConductBattle conductBattle = new ConductBattle();
        conductBattle.setCombatMode(mode);

        conductBattle.engage(this, hostiles);
    }


    //getters and setters

    public CombatMode getMode() {
        return mode;
    }

    public void setMode(CombatMode mode) {
        this.mode = mode;
        System.out.println("Mode set to " + mode.toString());
    }

    public int getHostiles() {
        return hostiles;
    }

    public void setHostiles(int hostiles) {
        this.hostiles = hostiles;
    }
}
