package panzer.models.miscellaneous;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import panzer.contracts.Assembler;
import panzer.contracts.AttackModifyingPart;
import panzer.contracts.DefenseModifyingPart;
import panzer.contracts.HitPointsModifyingPart;

import java.math.BigDecimal;

public class VehicleAssemblerTest {

    private Assembler vehicleAssembler;
    private AttackModifyingPart attackModifyingPart;
    private DefenseModifyingPart defenseModifyingPart;
    private HitPointsModifyingPart hitPointsModifyingPart;

    @Before
    public void setUp(){
        this.vehicleAssembler = new VehicleAssembler();
        this.attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        this.defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        this.hitPointsModifyingPart = Mockito.mock(HitPointsModifyingPart.class);

        this.vehicleAssembler.addEndurancePart(this.hitPointsModifyingPart);
        this.vehicleAssembler.addShellPart(this.defenseModifyingPart);
        this.vehicleAssembler.addArsenalPart(this.attackModifyingPart);
    }

    @Test
    public void getTotalWeight(){
        Mockito.when(this.attackModifyingPart.getWeight()).thenReturn(10.00);
        Mockito.when(this.hitPointsModifyingPart.getWeight()).thenReturn(5.00);
        Mockito.when(this.defenseModifyingPart.getWeight()).thenReturn(20.00);

        Double expected = 35.00;
        Assert.assertEquals(expected, this.vehicleAssembler.getTotalWeight(), 0.1);
    }

    @Test
    public void getTotalPrice(){
        Mockito.when(this.attackModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);
        Mockito.when(this.hitPointsModifyingPart.getPrice()).thenReturn(BigDecimal.ONE);
        Mockito.when(this.defenseModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);

        BigDecimal expected = BigDecimal.valueOf(21);
        Assert.assertEquals(expected, this.vehicleAssembler.getTotalPrice());
    }

    @Test
    public void getTotalAttackModification(){
        Mockito.when(this.attackModifyingPart.getAttackModifier()).thenReturn(5);
        Assert.assertEquals(5, this.vehicleAssembler.getTotalAttackModification());
    }

    @Test
    public void getTotalDefenseModification(){
        Mockito.when(this.defenseModifyingPart.getDefenseModifier()).thenReturn(5);
        Assert.assertEquals(5, this.vehicleAssembler.getTotalDefenseModification());
    }

    @Test
    public void getTotalHitPointModification(){
        Mockito.when(this.hitPointsModifyingPart.getHitPointsModifier()).thenReturn(5);
        Assert.assertEquals(5, this.vehicleAssembler.getTotalHitPointModification());
    }
}
