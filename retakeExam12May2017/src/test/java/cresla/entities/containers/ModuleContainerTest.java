package cresla.entities.containers;

import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ModuleContainerTest {

    private Container container;
    private EnergyModule energyModule;
    private AbsorbingModule absorbingModule;

    @Before
    public void before(){
        this.container = new ModuleContainer(2);
        this.energyModule = Mockito.mock(EnergyModule.class);
        this.absorbingModule = Mockito.mock(AbsorbingModule.class);

        Mockito.when(absorbingModule.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(absorbingModule.getId()).thenReturn(1);

        Mockito.when(energyModule.getEnergyOutput()).thenReturn(2_000_000_000);
        Mockito.when(energyModule.getId()).thenReturn(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEnergyModuleException() {
        this.container.addEnergyModule(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAbsorbingModuleException(){
        this.container.addAbsorbingModule(null);
    }

    @Test
    public void emptyContainerReturnsZero() {
        Assert.assertEquals(0, this.container.getTotalHeatAbsorbing());
        Assert.assertEquals(0, this.container.getTotalEnergyOutput());
    }
}
