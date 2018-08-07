package P04WorkForce.contracts;

/**
 * Interface for List of Observable objects. Those objects will contain
 * Observer/s that will watch for specified triggers.
 * @param <E> - A observable objects for a list
 */
public interface EventRespondingList<E extends Observable> {

    void update();


    void status();


    void addObservableObject(E observable);
}
