package app.models.participants;


public class Boss extends Participant {


    protected Boss(double gold) {
        super(gold);
    }

    @Override
    public double getDamage() {
        return 0;
    }
}
