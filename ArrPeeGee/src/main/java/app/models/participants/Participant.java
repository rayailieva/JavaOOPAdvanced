package app.models.participants;

import app.contracts.Targetable;

public abstract class Participant implements Targetable {
    private String name;
    private double health;
    private double gold;
    private boolean isAlive;

    protected Participant(double gold) {
        this.gold = gold;
        this.isAlive = true;
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
        this.name = name;
    }

    @Override
    public abstract double getDamage();

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
        return this.isAlive;
    }
}
