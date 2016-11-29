package Core;

import Ships.*;

//Factory pattern, creates hostile ships of the below 3 types.
public class ShipFactory {
    public HostileShip createShip(String shipType) {
        HostileShip hostile = null;

        if (shipType.equalsIgnoreCase("battlestar")) {
            hostile = new BattleStar();
        } else if (shipType.equalsIgnoreCase("battlecruiser")) {
            hostile = new BattleCruiser();
        } else if (shipType.equalsIgnoreCase("battleshooter")) {
            hostile = new BattleShooter();
        }
        return hostile;
    }
}

