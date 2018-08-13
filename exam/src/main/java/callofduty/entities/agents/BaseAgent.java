package callofduty.entities.agents;

import callofduty.interfaces.Agent;
import callofduty.interfaces.Mission;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseAgent implements Agent {
    private String id;
    private String name;
    private double rating;
    private List<Mission> missions;

    protected BaseAgent(String id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.missions = new ArrayList<>();
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getRating() {
        return this.rating;
    }

    @Override
    public void acceptMission(Mission mission) {
        this.missions.add(mission);
    }

    @Override
    public void completeMissions() {

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s Agent - %s%n", this.getClass().getSimpleName(),this.getName()));
        sb.append(String.format("Personal code: %s%n", this.getId()));
        sb.append(String.format("Assigned Missions: %d%n", this.missions.size()));
        sb.append(String.format("Completed Missions: %d%n", this.missions.size()));
        sb.append(String.format("Rating: %.2f%n", this.getRating()));
        return sb.toString();
    }
}
