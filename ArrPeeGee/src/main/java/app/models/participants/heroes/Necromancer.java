package app.models.participants.heroes;

import app.contracts.Hero;
import app.contracts.Targetable;
import app.models.Config;

public class Necromancer extends BaseHero implements Hero {

    private int strength;
    private int dexterity;
    private int intelligence;
    int level;

    private double health;
    private String name;
    boolean isAlive;
    double gold;

    public Necromancer() {
        this.isAlive = true;
        this.level = 1;
        this.gold = Config.HERO_START_GOLD;
        this.setStrength(Config.NECROMANCER_BASE_STRENGTH);
        this.setDexterity(Config.NECROMANCER_BASE_DEXTERITY);
        this.setIntelligence(Config.NECROMANCER_BASE_INTELLIGENCE);
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
        this.setHealth(strength * Config.HERO_HEALTH_MULTIPLIER);
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

    @Override
    public String attack(Targetable target) {
        return null;
    }

    @Override
    public void takeDamage(double damage) {
        this.setHealth(damage);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getDamage() {
        return (this.getIntelligence() * 2) + (this.getDexterity() * 2) + (this.getStrength() * 2);
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getGold() {
        return this.gold;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
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
