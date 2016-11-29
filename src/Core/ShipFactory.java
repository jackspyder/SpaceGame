package Core;

import Ships.BattleCruiser;
import Ships.BattleShooter;
import Ships.BattleStar;
import Ships.HostileShip;

public class ShipFactory {
    public HostileShip createShip(String shipType){
        HostileShip hostile = null;

        if(shipType.equalsIgnoreCase("battlestar")){
            hostile = new BattleStar();
        } else if(shipType.equalsIgnoreCase("battlecruiser")){
            hostile = new BattleCruiser();
        }else if(shipType.equalsIgnoreCase("battleshooter")){
            hostile = new BattleShooter();
        }

        return hostile;
    }
}
