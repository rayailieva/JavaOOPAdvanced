package genericBox;

import java.util.List;

public class Box<T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return this.element;
    }

   //public static <T> void swap(List<T> elements, int index1, int index2){
   //    T temp = elements.get(index2);
   //    elements.set(index2, elements.get(index1));
   //    elements.set(index1, temp);
   //}

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.getElement().getClass().getName(),
                this.getElement());
    }

}
