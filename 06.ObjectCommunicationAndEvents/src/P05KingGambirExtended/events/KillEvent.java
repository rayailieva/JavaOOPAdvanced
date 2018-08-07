package P05KingGambirExtended.events;

import P05KingGambirExtended.contracts.Observer;
import P05KingGambirExtended.contracts.Subject;

public class KillEvent {

    public void executeEvent(Observer observer, Subject subject) {
        observer.takeHit();

        if(observer.getHealth() <= 0) {
            subject.removeObserver(observer);
        }
    }
}
