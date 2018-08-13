package callofduty.entities.missions;

public class HuntMission extends BaseMission {
    public HuntMission(String id, double rating, double bounty) {
        super(id, rating * 1.50, bounty * 2);
    }
}
