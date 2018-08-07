package app.models.participants.heroes;

import app.contracts.Hero;
import app.contracts.Targetable;

public abstract class BaseHero implements Hero {
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

    @Override
    public String attack(Targetable target) {
        return null;
    }

    @Override
    public void takeDamage(double damage) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getDamage() {
        return 0;
    }

    @Override
    public double getHealth() {
        return 0;
    }

    @Override
    public double getGold() {
        return 0;
    }

    @Override
    public void setHealth(double health) {

    }

    @Override
    public void giveReward(Targetable targetable) {

    }

    @Override
    public void receiveReward(double reward) {

    }

    @Override
    public void levelUp() {

    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
