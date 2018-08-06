package cresla.entities.containers;

import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ModuleContainerTest {
    private Container moduleContainer;
    private EnergyModule energyModule;
    private AbsorbingModule absorbingModule;
    private EnergyModule energyModule2;
    private AbsorbingModule absorbingModule2;
    private EnergyModule energyModule3;
    private AbsorbingModule absorbingModule3;

    @Before
    public void setUp(){
        this.moduleContainer = new ModuleContainer(2);
        this.energyModule = Mockito.mock(EnergyModule.class);
        this.absorbingModule = Mockito.mock(AbsorbingModule.class);
        this.energyModule2 = Mockito.mock(EnergyModule.class);
        this.absorbingModule2 = Mockito.mock(AbsorbingModule.class);
        this.energyModule3 = Mockito.mock(EnergyModule.class);
        this.absorbingModule3 = Mockito.mock(AbsorbingModule.class);

        Mockito.when(absorbingModule.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(absorbingModule.getId()).thenReturn(1);
        Mockito.when(absorbingModule2.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(absorbingModule2.getId()).thenReturn(2);
        Mockito.when(energyModule.getEnergyOutput()).thenReturn(2_000_000_000);
        Mockito.when(energyModule.getId()).thenReturn(3);
        Mockito.when(energyModule2.getEnergyOutput()).thenReturn(2_000_000_000);
        Mockito.when(energyModule2.getId()).thenReturn(4);
        Mockito.when(energyModule3.getEnergyOutput()).thenReturn(2_000_000_000);
        Mockito.when(energyModule3.getId()).thenReturn(5);
        Mockito.when(absorbingModule3.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(absorbingModule3.getId()).thenReturn(6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEnergyModuleException(){
        this.moduleContainer.addEnergyModule(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAbsorbingModuleException(){
        this.moduleContainer.addAbsorbingModule(null);
    }

    @Test
    public void removeOldestEnergyModule(){
        this.moduleContainer.addEnergyModule(energyModule);
        this.moduleContainer.addEnergyModule(energyModule2);
        this.moduleContainer.addEnergyModule(energyModule3);

        Assert.assertEquals(4_000_000_000L, this.moduleContainer.getTotalEnergyOutput());
    }

    @Test
    public void removeOldestHeatAbsorbingModule(){
        this.moduleContainer.addAbsorbingModule(absorbingModule);
        this.moduleContainer.addAbsorbingModule(absorbingModule2);
        this.moduleContainer.addAbsorbingModule(absorbingModule3);

        Assert.assertEquals(4_000_000_000L, this.moduleContainer.getTotalHeatAbsorbing());
    }

    @Test
    public void getTotalEnergyOutput(){
        this.moduleContainer.addEnergyModule(energyModule);
        this.moduleContainer.addEnergyModule(energyModule2);

        Assert.assertEquals(4_000_000_000L, this.moduleContainer.getTotalEnergyOutput());
    }

    @Test
    public void getTotalHeatAbsorbing(){
        this.moduleContainer.addAbsorbingModule(absorbingModule);
        this.moduleContainer.addAbsorbingModule(absorbingModule2);

        Assert.assertEquals(4_000_000_000L, this.moduleContainer.getTotalHeatAbsorbing());

    }
}
