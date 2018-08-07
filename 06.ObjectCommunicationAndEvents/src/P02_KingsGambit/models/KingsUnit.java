package P02_KingsGambit.models;

import P02_KingsGambit.contracts.Attackable;
import P02_KingsGambit.contracts.KillableUnits;

public abstract class KingsUnit extends Unit implements KillableUnits {

    private Attackable king;

    KingsUnit(String name, Attackable king) {
        super(name);
        this.king = king;
        this.king.addUnits(this);
    }

    public abstract void update();
}