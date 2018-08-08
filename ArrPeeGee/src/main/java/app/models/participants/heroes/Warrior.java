package app.models.participants.heroes;

import app.models.Config;

public class Warrior extends BaseHero{

    public Warrior() {
        super();
        this.setStrength(Config.WARRIOR_BASE_STRENGTH);
        this.setDexterity(Config.WARRIOR_BASE_DEXTERITY);
        this.setIntelligence(Config.WARRIOR_BASE_INTELLIGENCE);
    }

    @Override
    public double getDamage() {
        return (this.getStrength() * 2) + this.getDexterity();
    }

    @Override
    protected void increaseStats(int multiplier) {
        this.setStrength(Config.WARRIOR_BASE_STRENGTH * multiplier);
        this.setDexterity(Config.WARRIOR_BASE_DEXTERITY * multiplier);
        this.setIntelligence(Config.WARRIOR_BASE_INTELLIGENCE * multiplier);
    }


}
