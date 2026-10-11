import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Arraylist {
    private final int arrayCapacity = 5;
    private int[] arraylist;
    private int size;

    public Arraylist() {
        this.arraylist = new int[arrayCapacity];
        this.size =0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void validateAddIndex(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index " + index + ", size " + size);
        }
    }
    private void validateElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index " + index + ", size " + size);
        }
    }

    private void growIfFull() {
        if (size == arraylist.length) {
            int[] newArrayList = new int[arraylist.length * 2];
            for (int position = 0; position < size; position++) {
                newArrayList[position] = arraylist[position];
            }
            arraylist = newArrayList;
        }
    }

    public void add(int element) {
        growIfFull();
        arraylist[size] = element;
        size++;
    }

    public void add(int index, int element) {
        validateAddIndex(index);
        growIfFull();
        for (int position = size; position > index; position--) {
            arraylist[position] = arraylist[position - 1];
        }
        arraylist[index] = element;
        size++;
    }

    public int getSize() {
        return size;

    }

    public void remove(int index) {
        validateElementIndex(index);
        for (int position = index; position < size - 1; position++) {
            arraylist[position] = arraylist[position + 1];
        }
        size--;
    }

    public boolean contains(int element) {
        for (int position = 0; position < size; position++) {
            if (arraylist[position] == element) {
                return true;
            }
        }
        return false;
    }

    public int removeFirst() {
        if (size == 0){
            throw new NoSuchElementException("arraylist is empty");
        }
        int removed = arraylist[0];
        for (int position = 1; position < size; position++){
            arraylist[position -1] = arraylist[position];
        }
        size --;
        return removed;
    }

    public int getElement(int index) {
       validateElementIndex(index);
        return  arraylist[index];
    }

    public int removeLast() {
        if (size == 0){
            throw new NoSuchElementException("arraylist is empty");
        }
        int removed = arraylist[size -1];
        size --;
        return removed;
    }

    public void set(int index, int element) {
        validateElementIndex(index);
        arraylist[index] = element;
    }
}
