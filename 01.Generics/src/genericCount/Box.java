package genericCount;

public class Box<T extends Comparable<T>> implements Comparable<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.getElement().getClass().getName(),
                this.getElement());
    }

    @Override
    public int compareTo(T o) {
        return getElement().compareTo(o);
    }
}
