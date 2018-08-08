package app.models.participants.boss;

import app.contracts.Targetable;
import app.models.Config;
import app.models.participants.Participant;

public class Boss extends Participant {
    private String name;
    private double health;
    private double damage;
    private double gold;
    // private boolean isAlive;

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
