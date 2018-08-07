package P05KingGambirExtended.contracts;

public interface Attackable {
    /**
     * A trigger for observers
     * basicali this is "updateState" method
     */
    void respondToAttack();


    /**
     * Necessary for adding observers;
     * @param kingsUnit - observer
     */
    void addUnits(KillableUnits kingsUnit);


    /**
     * Necessary for removing observers
     * @param s - name of the observer: String key in map with values of observers
     */
    void kill(String s);
}
