package panzer.core;

import panzer.contracts.BattleOperator;
import panzer.contracts.Manager;
import panzer.contracts.Part;
import panzer.contracts.Vehicle;
import panzer.models.parts.ArsenalPart;
import panzer.models.parts.EndurancePart;
import panzer.models.parts.ShellPart;
import panzer.models.vehicles.Revenger;
import panzer.models.vehicles.Vanguard;

import java.math.BigDecimal;
import java.util.*;

public class ProgramManager implements Manager {
    private Map<String, Vehicle> vehicleMap;
    private Map<String, Part> partMap;
    private List<String> remainingVehicles;
    private List<String> defeatedVehicles;
    private BattleOperator battleOperator;

    public ProgramManager() {
        this.vehicleMap = new LinkedHashMap<>();
        this.partMap = new LinkedHashMap<>();
        this.remainingVehicles = new LinkedList<>();
        this.defeatedVehicles = new LinkedList<>();
        this.battleOperator = new PanzerBattleOperator();
    }

    @Override
    public String addVehicle(List<String> arguments) {
        switch(arguments.get(1)){
            case "Revenger":
                Vehicle revenger = new Revenger(
                        arguments.get(2),
                        Double.parseDouble(arguments.get(3)),
                        new BigDecimal(arguments.get(4)),
                        Integer.parseInt(arguments.get(5)),
                        Integer.parseInt(arguments.get(6)),
                        Integer.parseInt(arguments.get(7)));
                this.vehicleMap.put(arguments.get(2),revenger);
                this.remainingVehicles.add(arguments.get(2));
                break;
            case "Vanguard":
                Vehicle vanguard = new Vanguard(
                        arguments.get(2),
                        Double.parseDouble(arguments.get(3)),
                        new BigDecimal(arguments.get(4)),
                        Integer.parseInt(arguments.get(5)),
                        Integer.parseInt(arguments.get(6)),
                        Integer.parseInt(arguments.get(7)));
                this.vehicleMap.put(arguments.get(2),vanguard);
                this.remainingVehicles.add(arguments.get(2));
                break;
        }
        return "Created " + arguments.get(1) + " Vehicle - " + arguments.get(2);
    }

    @Override
    public String addPart(List<String> arguments) {
        switch (arguments.get(2)){
            case "Arsenal":
                Part arsenal = new ArsenalPart(arguments.get(3),
                        Double.parseDouble(arguments.get(4)),
                        new BigDecimal(arguments.get(5)),
                        Integer.parseInt(arguments.get(6)));
                this.vehicleMap.get(arguments.get(1)).addArsenalPart(arsenal);
                this.partMap.put(arguments.get(3),arsenal);
                break;
            case "Shell":
                Part shell = new ShellPart(arguments.get(3),
                        Double.parseDouble(arguments.get(4)),
                        new BigDecimal(arguments.get(5)),
                        Integer.parseInt(arguments.get(6)));
                this.vehicleMap.get(arguments.get(1)).addShellPart(shell);
                this.partMap.put(arguments.get(3),shell);
                break;
            case "Endurance":
                Part endurance = new EndurancePart(arguments.get(3),
                        Double.parseDouble(arguments.get(4)),
                        new BigDecimal(arguments.get(5)),
                        Integer.parseInt(arguments.get(6)));
                this.vehicleMap.get(arguments.get(1)).addEndurancePart(endurance);
                this.partMap.put(arguments.get(3),endurance);
                break;
        }
        return "Added " + arguments.get(2) + " - "+arguments.get(3)+" to Vehicle - "+arguments.get(1);
    }

    @Override
    public String inspect(List<String> arguments) {
        if(this.vehicleMap.containsKey(arguments.get(1))){
            return this.vehicleMap.get(arguments.get(1)).toString();
        }else {
            return this.partMap.get(arguments.get(1)).toString();
        }
    }

    @Override
    public String battle(List<String> arguments) {
        String winner =
                this.battleOperator.battle(this.vehicleMap.get(arguments.get(1)),this.vehicleMap.get(arguments.get(2)));
        if(winner.equals(arguments.get(1))){
            this.vehicleMap.remove(this.vehicleMap.get(arguments.get(2)).getModel());
            defeatedVehicles.add(arguments.get(2));
            this.remainingVehicles.remove(arguments.get(2));
        }else{
            this.vehicleMap.remove(this.vehicleMap.get(arguments.get(1)).getModel());
            defeatedVehicles.add(arguments.get(1));
            this.remainingVehicles.remove(arguments.get(1));
        }

        return String.format("%s versus %s -> %s Wins! Flawless Victory!",
                arguments.get(1), arguments.get(2), winner);
    }

    @Override
    public String terminate(List<String> arguments) {
        StringBuilder sb = new StringBuilder();

        if(this.remainingVehicles.size() == 0){
            sb.append("Remaining Vehicles: ");
            sb.append("None").append("\n");
        }else{
            sb.append("Remaining Vehicles: ");
            sb.append(String.join(", ", this.remainingVehicles)).append("\n");
        }
        if(this.defeatedVehicles.size() == 0){
            sb.append("Defeated Vehicles: ");
            sb.append("None").append("\n");
        }else{
            sb.append("Defeated Vehicles: ");
            sb.append(String.join(", ", this.defeatedVehicles)).append("\n");
        }
        final int[] currentlyUsedParts = {0};
        this.vehicleMap.entrySet().
                forEach(x->{
                    List<Part> toJoin=new ArrayList<>((Collection<? extends Part>) x.getValue().getParts());
                    currentlyUsedParts[0] += toJoin.size();
                });
        sb.append("Currently Used Parts: "+currentlyUsedParts[0]);
        return sb.toString();
    }
}
