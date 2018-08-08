package app.models.participants;

import app.contracts.Targetable;

public abstract class Participant implements Targetable {

    private String name;
    private double health;
    private double gold;
    private boolean isAlive;

    protected Participant() {
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
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public abstract double getDamage();

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
