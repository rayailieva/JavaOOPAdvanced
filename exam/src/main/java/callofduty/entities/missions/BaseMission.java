package callofduty.entities.missions;

import callofduty.interfaces.Mission;

public abstract class BaseMission implements Mission {
    private String id;
    private Double rating;
    private Double bounty;

    private boolean isCompleted;

    protected BaseMission(String id, Double rating, Double bounty) {
        this.id = id;
        this.rating = rating;
        this.bounty = bounty;
        isCompleted = false;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    @Override
    public Double getBounty() {
        return this.bounty;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }
}
