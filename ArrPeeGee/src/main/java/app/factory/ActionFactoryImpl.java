package app.factory;

import app.contracts.Action;
import app.contracts.ActionFactory;
import app.models.actions.BossFight;
import app.models.actions.OneVsOne;

public class ActionFactoryImpl implements ActionFactory {
    @Override
    public Action create(String actionName, String... participantNames) throws ClassNotFoundException {
        switch (actionName) {
            case "OneVsOne":
                return new OneVsOne();
            case "BossFight":
                return new BossFight();
            default:
                throw new ClassNotFoundException();
        }
    }
}
