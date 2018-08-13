package callofduty.entities.missions;

public class EscortMission extends BaseMission {
    public EscortMission(String id, double rating, double bounty) {
        super(id, rating * 0.75, bounty * 1.25);
    }
}
