package app.models.participants.heroes;

import app.models.Config;

public class Necromancer extends BaseHero {
    public Necromancer() {
        super();
        this.setStrength(Config.NECROMANCER_BASE_STRENGTH);
        this.setDexterity(Config.NECROMANCER_BASE_DEXTERITY);
        this.setIntelligence(Config.NECROMANCER_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return 0;
    }
}
