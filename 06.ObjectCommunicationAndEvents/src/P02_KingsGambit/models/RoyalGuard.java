package P02_KingsGambit.models;

import P02_KingsGambit.contracts.Attackable;

public class RoyalGuard extends KingsUnit {

    public RoyalGuard(String name, Attackable king) {
        super(name, king);
    }

    @Override
    public void update() {
        System.out.println("Royal Guard " + this.name + " is defending!");
    }
}
