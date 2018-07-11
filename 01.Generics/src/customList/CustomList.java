package customList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable>{

    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element){
        this.list.add(element);
    }

    public int count(){
        return this.list.size();
    }

    public T get(int index){
        return this.list.get(index);
    }

    public void set(int index, T element){
        this.list.set(index, element);
    }

    public T remove(int index){
        return this.list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        T temp = list.get(secondIndex);
        list.set(secondIndex, list.get(firstIndex));
        list.set(firstIndex, temp);
    }

    public int countGreaterThan(T element){
        int counter = 0;

        for (int i = 0; i < this.list.size(); i++){
            if (list.get(i).compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }

    public T getMax(){
        T max = list.get(0);
        for (int i = 1; i < this.list.size(); i++){
            if (max.compareTo(list.get(i)) < 0){
                max = list.get(i);
            }
        }
        return max;
    }
    public T getMin(){
        T min = list.get(0);
        for (int i = 1; i < this.list.size(); i++){
            if (min.compareTo(list.get(i)) > 0){
                min = list.get(i);
            }
        }
        return min;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
