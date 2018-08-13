package app.models.participants;

import app.models.Config;

public class Necromancer extends BaseHero {
    public Necromancer() {
        super(Config.NECROMANCER_BASE_STRENGTH, Config.NECROMANCER_BASE_DEXTERITY, Config.NECROMANCER_BASE_INTELLIGENCE);
    }

    public Necromancer(String name) {
        this();
        this.setName(name);
    }

    @Override
    public double getDamage() {
        return (super.getIntelligence() * 2) +
                (super.getDexterity() * 2) +
                (super.getStrength() * 2);
    }
}
