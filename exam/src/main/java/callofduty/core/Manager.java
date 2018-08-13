package callofduty.core;

import callofduty.entities.agents.NoviceAgent;
import callofduty.interfaces.Agent;
import callofduty.interfaces.Mission;
import callofduty.interfaces.MissionControl;
import callofduty.interfaces.MissionManager;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Manager implements MissionManager {
    private Map<String, Agent> agents;
    private Map<String, Mission> missions;
    private MissionControl missionControl;

    public Manager() {
        this.agents = new LinkedHashMap<>();
        this.missions = new LinkedHashMap<>();
        this.missionControl = new MissionControlImpl();
    }

    @Override
    public String agent(List<String> arguments) {
        Agent agent = new NoviceAgent(arguments.get(1),
                arguments.get(2));
        this.agents.put(arguments.get(1), agent);
        return String.format("Registered Agent - %s:%s",
        arguments.get(2), arguments.get(1));
    }

    @Override
    public String request(List<String> arguments) {
        String agentId = arguments.get(1);
        if(this.agents.containsKey(agentId)) {
            Agent agent = agents.get(agentId);

            Mission mission = null;
            try {
                mission = this.missionControl.generateMission(arguments.get(2),
                       Double.parseDouble(arguments.get(3)), Double.parseDouble(arguments.get(4)));
            } catch (InvocationTargetException |NullPointerException| NoSuchMethodException | InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
            this.agents.get(agentId).acceptMission(mission);
            if(mission.getClass().getSimpleName().equals("EscortMission")) {
                return String.format("Assigned Escort Mission - %s to Agent - %s", arguments.get(2), agent.getName()); }

            if(mission.getClass().getSimpleName().equals("HuntMission")) {
                return String.format("Assigned Hunt Mission - %s to Agent - %s", arguments.get(2), agent.getName());
            }
            if(mission.getClass().getSimpleName().equals("SurveillanceMission")) {
                return String.format("Assigned Surveillance Mission - %s to Agent - %s", arguments.get(2), agent.getName());
            }
            this.missions.put(arguments.get(2), mission);
        }
        return "";
    }

    @Override
    public String complete(List<String> arguments) {
        if(this.agents.containsKey(arguments.get(1))){
            Agent agent = agents.get(arguments.get(1));
            agent.completeMissions();
            return String.format("Agent - %s:%s has completed all assigned missions.",
                    agent.getClass().getSimpleName(), agent.getId());
        }
        return "";
    }

    @Override
    public String status(List<String> arguments) {
        if(this.agents.containsKey(arguments.get(1))) {
            return this.agents.get(arguments.get(1)).toString();
        }
            return this.missions.get(arguments.get(1)).toString();

    }

    @Override
    public String over(List<String> arguments) {
        return null;
    }
}
