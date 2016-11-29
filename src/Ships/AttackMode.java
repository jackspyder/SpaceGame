package Ships;

public class AttackMode implements CombatMode{
    @Override
    public void battle(int hostiles) {
            //if hostiles >2 then die. else, kill enemy.
        if(hostiles > 2){
            System.out.println("In def mode you lost against: " + hostiles + " enemies");
        }else{
            System.out.println("In def mode you won against: " + hostiles + " enemies");
        }
    }
}
