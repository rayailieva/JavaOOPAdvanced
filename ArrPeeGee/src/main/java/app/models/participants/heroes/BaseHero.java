package app.models.participants.heroes;

import app.contracts.Hero;
import app.models.Config;
import app.models.participants.Participant;

public abstract class BaseHero extends Participant implements Hero {

    private int strength;
    private int dexterity;
    private int intelligence;
    private int level;

    protected BaseHero() {
        this.level = 1;
        super.receiveReward(Config.HERO_START_GOLD);
    }


    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public void setStrength(int strength) {

    }

    @Override
    public int getDexterity() {
        return 0;
    }

    @Override
    public void setDexterity(int dexterity) {

    }

    @Override
    public int getIntelligence() {
        return 0;
    }

    @Override
    public void setIntelligence(int intelligence) {

    }
}
