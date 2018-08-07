package P02_KingsGambit.models;

import P02_KingsGambit.contracts.Attackable;

public class Footman extends KingsUnit {

    public Footman(String name, Attackable king) {
        super(name, king);
    }

    @Override
    public void update() {
        System.out.println("Footman " + this.name + " is panicking!");
    }
}
