import java.util.Iterator;
import java.util.LinkedList;

public class MyHashSet<T> implements Iterable<T>{
    private LinkedList<T>[] hashset;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

    public MyHashSet() {
        hashset = new LinkedList[capacity];
    }

    public boolean add(T element){
        if(size > capacity * loadFactor){
            rebalance();
        }
        int index = getIndex(element);
        if(hashset[index] == null){
            hashset[index] = new LinkedList<>();
        }
        if(hashset[index].contains(element)){
            return false;
        }
        hashset[index].add(element);
        size++;
        return true;
    }
    private void rebalance(){
        capacity *= 2;
        LinkedList<T>[] newHashset = new LinkedList[capacity];
        for(int i = 0; i < hashset.length; i++){
            if(hashset[i] != null){
                for(T e : hashset[i]){
                    int index = getIndex(e);
                    if(newHashset[index] == null){
                        newHashset[index] = new LinkedList<>();
                    }
                    newHashset[index].add(e);
                }
            }
        }
        hashset = newHashset;
    }

    public boolean contains(T element){
        //Todo home task
        return false;
    }

    public boolean remove(T element){
        //Todo home task
        return false;
    }

    private int getIndex(T element) {
        int hashcode = element.hashCode();
        hashcode = hashcode > 0 ? hashcode : -hashcode;
        return hashcode % capacity;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        //Todo home task
        return null;
    }
}
