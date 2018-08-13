package callofduty.entities.missions;

public class SurveillanceMission extends BaseMission {
    public SurveillanceMission(String id, double rating, double bounty) {
        super(id, rating * 0.25, bounty * 1.50);
    }
}
