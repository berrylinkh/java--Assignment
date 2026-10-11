import java.util.ArrayList;
import java.util.LinkedList;

public class Queue {
    private ArrayList<String> queue = new ArrayList<>();
    private int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }

    public void addElement(String element) {
        queue.add(element);
        size++;
    }

    public int getSize() {
        return size;

    }

    public void RemoveElement(String element) {
        queue.remove(0);
        size--;
    }

    public String pollElement() {
        if (isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public String peekElement(String word) {
        for (String element : queue) {
            if (element == word) {
                return element;
            }
        }
        if (isEmpty()) {
            return null;
        }
        return word;
    }
}