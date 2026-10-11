import java.util.NoSuchElementException;

public class MySet {
        private  int setCapacity = 5;
        private String[] mySet;
        private int size;

        public MySet() {
            this.mySet = new String[setCapacity];
            this.size =0;
        }

        public boolean isEmpty() {
            return size == 0;
        }
        public int getSize() {
            return size;

        }

        private void validateAddIndex(int index) {
            if (index < 0 || index > size) {
                throw new IllegalArgumentException("index " + index + ", size " + size);
            }
        }
        private void validateElementIndex(int index) {
            if (index < 0 || index >= size) {
                throw new UnsupportedOperationException("index " + index + ", size " + size);
            }
        }

        private void growIfFull() {
            if (size == mySet.length) {
                String[] newSet = new String[mySet.length * 2];
                for (int position = 0; position < size; position++) {
                    newSet[position] = mySet[position];
                }
                mySet = newSet;
            }
        }
        public boolean add(String element){
            if(contains(element)){
                return false;
            }
            growIfFull();
            mySet[size] = element;
            size++;
            return true;
        }


    public boolean add(int index, String element) {
            validateAddIndex(index);
            if(contains(element)){
                return false;
            }
            growIfFull();
            for (int position = size; position > index; position--) {
                mySet[position] = mySet[position - 1];
            }
            mySet[index] = element;
            size++;
            return true;
        }

        public void remove(int index) {
            for (int position = index; position < size -1; position++) {
                mySet[position] = mySet[position + 1];
            }
                   mySet [size-1] = null;
                   size --;
               }


        public boolean contains(String element) {
            for (int position = 0; position < size; position++) {
                if (mySet[position].equals( element)) {
                    return true;
                }
            }
            return false;
        }
        public String  getElement(int index) {
            validateElementIndex(index);
            return mySet[index];
        }
        public void clear() {
            for (int position = 0; position < size ; position++) {
                mySet[position] = null;
            }
            size =0;
        }
}