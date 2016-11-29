package Ships;
//combat mode interfaced used in the strategy pattern
public interface CombatMode {
    public void battle(PlayerShip ship, int hostiles);
}
