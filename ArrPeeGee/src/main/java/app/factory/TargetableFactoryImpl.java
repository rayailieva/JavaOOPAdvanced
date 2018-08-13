package app.factory;

import app.contracts.Targetable;
import app.contracts.TargetableFactory;
import app.models.participants.Boss;
import app.models.participants.Wizard;

import java.lang.reflect.InvocationTargetException;

public class TargetableFactoryImpl implements TargetableFactory {
    @Override
    public Targetable create(String name, String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        switch (className) {
            case "Boss":
                return new Boss(name);
            case "Wizard":
                return new Wizard(name);
            case TargetableNames.TARGETABLE_WARRIOR:
                return new Warrior(name);
            case TargetableNames.TARGETABLE_NECROMANCER:
                return new Necromancer(name);
            default:
                throw new ClassNotFoundException();
        }
    }
}
