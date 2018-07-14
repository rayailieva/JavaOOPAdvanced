package listyIterator;

import java.util.List;
import java.util.NoSuchElementException;

public class ListyIterator {
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
}
