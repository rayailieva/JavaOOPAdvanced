package app.models.participants;

import app.contracts.Hero;
import app.models.Config;

public abstract class BaseHero extends Participant implements Hero {
    private int strength;
    private int dexterity;
    private int intelligence;

    protected BaseHero(int strength, int dexterity, int intelligence) {
        super(Config.HERO_START_GOLD);
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        //this.setHealth(this.getMaxHealth());
    }

    @Override
    public abstract double getDamage();

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getDexterity() {
        return this.dexterity;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
