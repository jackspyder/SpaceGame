package Ships;

public class DefenceMode implements CombatMode{
    @Override
    public void battle(int hostiles) {
        //if hostiles >1 then dies, else kill enemy.
        if(hostiles > 1){
            System.out.println("In def mode you lost against: " + hostiles + " enemies");
        }else{
            System.out.println("In def mode you won against: " + hostiles + " enemies");
        }
    }
}
