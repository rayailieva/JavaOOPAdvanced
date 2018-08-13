package callofduty.entities.agents;

import callofduty.interfaces.BountyAgent;
import callofduty.interfaces.Bountyable;

public class MasterAgent extends BaseAgent implements Bountyable, BountyAgent {
    private double bounty;

    public MasterAgent(String id, String name, double rating, double bounty) {
        super(id, name, rating);
        this.bounty = 0;
    }

    @Override
    public Double getBounty() {
        return this.bounty;
    }

    @Override
    public String toString() {
        return null;
    }
}
