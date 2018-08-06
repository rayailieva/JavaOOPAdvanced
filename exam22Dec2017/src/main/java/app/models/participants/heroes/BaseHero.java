package app.models.participants.heroes;

import app.contracts.Hero;
import app.contracts.Targetable;

public class BaseHero implements Hero {
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int level;
    private int health;
    private double damage;
    private double gold;
    private boolean isAlive;

    protected BaseHero(String name, int strength, int dexterity, int level, int health, double damage, double gold, boolean isAlive) {
        this.setName(name);
        this.setStrength(strength);
        this.setDexterity(dexterity);
        this.level = 1;
        this.setHealth(health);
        this.damage = damage;
        this.gold = gold;
        this.isAlive = isAlive;
    }

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

    }

    @Override
    public int getIntelligence() {
        return this.intelligence;
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
        return this.name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public double getDamage() {
        return this.damage;
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
