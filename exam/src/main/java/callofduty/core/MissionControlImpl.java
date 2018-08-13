package callofduty.core;

import callofduty.interfaces.Mission;
import callofduty.interfaces.MissionControl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MissionControlImpl implements MissionControl {
    private static final Integer MISSION_ID_MAXIMUM_LENGTH = 8;

    private static final Double MISSION_RATING_MINIMUM_VALUE = 0D;

    private static final Double MISSION_RATING_MAXIMUM_VALUE = 100D;

    private static final Double MISSION_BOUNTY_MINIMUM_VALUE = 0D;

    private static final Double MISSION_BOUNTY_MAXIMUM_VALUE = 1000000D;

    private Map<String, Class> missionClasses;

    private Iterator<Map.Entry<String, Class>> missionIterator;

    public MissionControlImpl() {
        this.initMissionClasses();
        this.missionIterator = this.missionClasses
                .entrySet()
                .iterator();
    }

    private void initMissionClasses() {
        try {
            this.missionClasses = new LinkedHashMap<>() {{
                put("EscortMission", Class.forName("callofduty.entities.missions.EscortMission"));
                put("HuntMission", Class.forName("callofduty.entities.missions.HuntMission"));
                put("SurveillanceMission", Class.forName("callofduty.entities.missions.SurveillanceMission"));
            }};
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private String checkAndReformMissionId(String missionId) {
        if(missionId.length() > MISSION_ID_MAXIMUM_LENGTH){
            return missionId.substring(0, MISSION_ID_MAXIMUM_LENGTH);
        }
        return missionId;
    }

    private Double checkAndReformMissionRating(Double missionRating) {
       if(missionRating < MISSION_BOUNTY_MINIMUM_VALUE){
           missionRating = MISSION_RATING_MINIMUM_VALUE;
       }else if(missionRating > MISSION_RATING_MAXIMUM_VALUE){
           missionRating = MISSION_RATING_MAXIMUM_VALUE;
       }
       return missionRating;
    }

    private Double checkAndreformMissionBounty(Double missionBounty) {
        if(missionBounty < MISSION_BOUNTY_MINIMUM_VALUE){
            missionBounty = MISSION_BOUNTY_MINIMUM_VALUE;
        }else if(missionBounty > MISSION_BOUNTY_MAXIMUM_VALUE){
            missionBounty = MISSION_BOUNTY_MAXIMUM_VALUE;
        }
        return missionBounty;
    }

    private void updateMissionType() {
        this.missionIterator = this
                .missionClasses
                .entrySet()
                .iterator();
    }

    private Class currentMission() {
        if (this.missionIterator.hasNext()) {
            this.updateMissionType();
        }

        return this.missionIterator.next().getValue();
    }

    private Mission instantiateMissionObject(String missionId, double missionRating, double missionBounty) {
        Mission missionObject = null;

        try {
            missionObject = (Mission)
                    this.currentMission()
                            .getConstructor(String.class, double.class, double.class)
                            .newInstance(missionId, missionRating, missionBounty);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException ignored) {

        }

        return missionObject;
    }


    @Override
    public Mission generateMission(String missionId, Double missionRating, Double missionBounty){
        missionId = this.checkAndReformMissionId(missionId);
        missionRating = this.checkAndReformMissionRating(missionRating);
        missionBounty = this.checkAndreformMissionBounty(missionBounty);

       return this.instantiateMissionObject(missionId, missionRating, missionBounty);
       }
}