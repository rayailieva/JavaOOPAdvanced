package app.models.participants;

import app.models.Config;

public class Wizard extends BaseHero {
    public Wizard() {
        super(Config.WIZARD_BASE_STRENGTH, Config.WIZARD_BASE_DEXTERITY, Config.WIZARD_BASE_INTELLIGENCE);
    }

    public Wizard(String name){
        this();
        this.setName(name);
    }

    @Override
    public double getDamage() {
        return super.getIntelligence() * 5 + this.getDexterity();
    }
}
