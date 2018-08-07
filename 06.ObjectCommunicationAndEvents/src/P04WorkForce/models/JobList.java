package P04WorkForce.models;

import P04WorkForce.contracts.EventRespondingList;

import java.util.ArrayList;

public class JobList<T extends Job> extends ArrayList<T> implements EventRespondingList<T> {

    /**
     * Object of type {@link Observer} which will collect jobs on specific event
     * and on the updateState of the current list will return those collected jobs to
     * remove them from current list
     */
    private Observer eventListener;

    /**
     * Constructor
     * @param eventListener - the Observer
     */
    public JobList(Observer eventListener) {
        this.eventListener = eventListener;
    }

    /**
     * Method for updating all contained Jobs
     */
    @Override
    public void update() {
        for (T job : this) {
            job.updateState();
        }
        // if some of jobs triggers the event (remaining hours get <= 0)
        // the Observer is going to provide them to be deleted
        this.removeAll(this.eventListener.getJobsToRemove());
    }


    /**
     * Take the status of each Job
     */
    @Override
    public void status() {
        for(T job : this) {
            job.status();
        }
    }

    @Override
    public void addObservableObject(T observable) {
        this.add(observable);
    }
}
