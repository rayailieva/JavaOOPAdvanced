package callofduty.core;

import callofduty.interfaces.Mission;
import callofduty.interfaces.MissionControl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class MissionControlImplTest {

    private MissionControl missionControl;

    @Before
    public void setUp(){
        this.missionControl = new MissionControlImpl();
    }

    @Test
    public void checkClassType() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", 10d, 10d);
        Assert.assertEquals("EscortMission", mission.getClass().getSimpleName());
    }

    @Test
    public void generateMissionId() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
     Mission mission = this.missionControl.generateMission("id", 10.00, 10.00);
     Assert.assertEquals("id", mission.getId());
    }

    @Test
    public void generateMissionIdd() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("iddddddd", 10.00, 10.00);
        Assert.assertEquals("iddddddd", mission.getId());
    }

    @Test
    public void generateMissionRating() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", 10d, 10.00);
        Assert.assertEquals(Double.valueOf(7.5), mission.getRating());
    }

    @Test
    public void generateMissionBounty() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", 10d, 10d);
        Assert.assertEquals(Double.valueOf(12.5), mission.getBounty());
    }

    @Test
    public void generateMissionWithWrongId() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("eeeeeeeee", 10.00, 10.00);
        Assert.assertEquals("eeeeeeee", mission.getId());
    }

    @Test
    public void generateMissionWithNegativeRating() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(-1), 10.00);
        Assert.assertEquals(Double.valueOf(0), mission.getRating());
    }

    @Test
    public void generateMission() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(1), 10.00);
        Assert.assertEquals(Double.valueOf(0.75), mission.getRating());
    }

    @Test
    public void generateMissionWithTooBigRating() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(200), 10.00);
        Assert.assertEquals(Double.valueOf(75), mission.getRating());
    }

    @Test
    public void generateMissionWithNegativeBounty() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(10), (double) -2);
        Assert.assertEquals(Double.valueOf(0), mission.getBounty());
    }

    @Test
    public void generateMissionWithBounty() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(10), (double) 5);
        Assert.assertEquals(Double.valueOf(6.25), mission.getBounty());
    }


    @Test
    public void generateMissionWithZeroBounty() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(10), (double) 0);
        Assert.assertEquals(Double.valueOf(0), mission.getBounty());
    }

    @Test
    public void generateMissionWithTooBigBounty() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", Double.valueOf(10), (double) 2000000);
        Assert.assertEquals(Double.valueOf(1250000), mission.getBounty());
    }

    @Test
    public void generateMissionWithTooBigEverything() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("iddddddddd", Double.valueOf(1000), (double) 2000000);
        Assert.assertEquals(Double.valueOf(1250000), mission.getBounty());
        Assert.assertEquals(Double.valueOf(75.0), mission.getRating());
        Assert.assertEquals("iddddddd", mission.getId());
    }

    @Test
    public void updateMissionType() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Mission mission = this.missionControl.generateMission("id", 10.0, 10.0);
        Mission mission1 = this.missionControl.generateMission("idd", 10.0, 10.0);

        Assert.assertEquals("EscortMission", mission1.getClass().getSimpleName());
    }
}
