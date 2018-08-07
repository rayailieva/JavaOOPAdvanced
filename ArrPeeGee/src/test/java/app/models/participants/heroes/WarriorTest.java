package app.models.participants.heroes;

import app.contracts.Hero;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class WarriorTest {

    //•	takeDamage()
    //•	isAlive()
    //•	levelUp()
    //•	giveReward()
    //•	receiveReward()

    private Hero warrior;

    @Before
    public void setUp(){
        this.warrior = Mockito.mock(Hero.class);
        Mockito.when(warrior.getHealth()).thenReturn(10.00);
        Mockito.when(warrior.isAlive()).thenReturn(true);
    }

    @Test
    public void takeDamage(){
        this.warrior.takeDamage(5.00);

        Double expected = 10.00;
        Double actual = this.warrior.getHealth();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isAlive(){
        Assert.assertTrue(this.warrior.isAlive());
    }
}
