package app.models.participants.heroes;

import app.models.Config;

public class Wizard extends BaseHero {
    public Wizard() {
        super();
        this.setStrength(Config.WIZARD_BASE_STRENGTH);
        this.setDexterity(Config.WIZARD_BASE_DEXTERITY);
        this.setIntelligence(Config.WIZARD_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return 0;
    }
}
