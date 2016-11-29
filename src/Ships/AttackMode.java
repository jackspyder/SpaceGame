package Ships;

//one of two combat modes used in the strategy pattern
public class AttackMode implements CombatMode{
    @Override
    public void battle(PlayerShip ship, int hostiles) {
            //if hostiles >2 then die. else, kill enemy.
        if(hostiles > 2){
            System.out.println("In Attack mode you lost against: " + hostiles + " enemies");
            ship.setAlive(false);
        }else{
            System.out.println("In Attack mode you won against: " + hostiles + " enemies");
        }
    }
}
