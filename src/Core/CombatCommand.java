package Core;


import Ships.PlayerShip;
//Command to conduct combat between player ship and hostile ships.
public class CombatCommand implements Command{
    PlayerShip ship;

    public CombatCommand(PlayerShip ship){
        this.ship = ship;
    }

    public void execute(){
        ship.battle();
    }

}
