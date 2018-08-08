package panzer.models.vehicles;

import panzer.contracts.Assembler;
import panzer.contracts.Part;
import panzer.contracts.Vehicle;
import panzer.models.miscellaneous.VehicleAssembler;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public abstract class BaseVehicle implements Vehicle {

    private String model;
    private double weight;
    private BigDecimal price;
    private int attack;
    private int defense;
    private int hitpoints;
    private Assembler assembler;
    private List<Part> parts;

    protected BaseVehicle(String model, double weight, BigDecimal price, int attack, int defense, int hitpoints) {
        this.model = model;
        this.weight = weight;
        this.price = price;
        this.attack = attack;
        this.defense = defense;
        this.hitpoints = hitpoints;
        this.assembler = new VehicleAssembler();
        this.parts = new LinkedList<>();
    }

    @Override
    public double getTotalWeight() {
        return this.weight + this.assembler.getTotalWeight();
    }

    @Override
    public BigDecimal getTotalPrice() {
        return this.assembler.getTotalPrice().add(this.price);
    }

    @Override
    public long getTotalAttack() {
        return this.assembler.getTotalAttackModification() + this.attack;
    }

    @Override
    public long getTotalDefense() {
        return this.assembler.getTotalDefenseModification() + this.defense;
    }

    @Override
    public long getTotalHitPoints() {
        return this.assembler.getTotalHitPointModification() + this.hitpoints;
    }

    @Override
    public void addArsenalPart(Part arsenalPart) {
        this.assembler.addArsenalPart(arsenalPart);
        this.parts.add(arsenalPart);
    }

    @Override
    public void addShellPart(Part shellPart) {
        this.assembler.addShellPart(shellPart);
        this.parts.add(shellPart);
    }

    @Override
    public void addEndurancePart(Part endurancePart) {
        this.assembler.addEndurancePart(endurancePart);
        this.parts.add(endurancePart);
    }

    @Override
    public Iterable<Part> getParts() {
        return this.parts;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
