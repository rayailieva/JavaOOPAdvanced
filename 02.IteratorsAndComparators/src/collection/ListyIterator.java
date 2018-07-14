package collection;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListyIterator implements Iterable<String> {
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(List<String> elements) {
        this.elements = elements;
    }

    public List<String> getElements() {
        return this.elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public boolean move(){
        if(this.getElements().size() - 1 > this.getCurrentIndex()){
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext(){
        if(this.getElements().size() - 1 > this.getCurrentIndex()){
            return true;
        }
        return false;
    }

    public void print(){
        if (this.getElements().isEmpty()){
            throw new NoSuchElementException("Invalid Operation!");
        }
        System.out.println(this.getElements().get(this.getCurrentIndex()));

    }

    public void printAll(){
        if (this.getElements().isEmpty()){
            throw new NoSuchElementException("Invalid Operation!");
        }
        System.out.println(this.getElements().toString().replaceAll("[\\[\\],]", ""));
    }

    @Override
    public Iterator<String> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<String>{
        private int index;

        @Override
        public boolean hasNext() {
            return this.index < getElements().size();
        }

        @Override
        public String next() {
            return getElements().get(index++);
        }
    }
}
