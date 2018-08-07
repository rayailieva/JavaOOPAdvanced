package app.models.participants.boss;

import app.contracts.Targetable;
import app.models.Config;

public class Boss implements Targetable {

    private double health;
    private double damage;
    private String name;
    double gold;

    public Boss() {
        this.gold = Config.BOSS_GOLD;
        this.health = Config.BOSS_HEALTH;
        this.damage = Config.BOSS_DAMAGE;
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
