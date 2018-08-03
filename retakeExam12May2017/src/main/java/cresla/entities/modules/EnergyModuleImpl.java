package cresla.entities.modules;

import cresla.interfaces.EnergyModule;

public class EnergyModuleImpl extends ModuleImpl implements EnergyModule {

    private int energyOutput;

    EnergyModuleImpl(int id, int heatAbsorbing) {
        super(id);
        this.energyOutput = heatAbsorbing;
    }

    @Override
    public int getEnergyOutput() {
        return this.energyOutput;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Module - " +
                super.getId() + System.lineSeparator() +
                "Energy Output: " + this.energyOutput;
    }
}
