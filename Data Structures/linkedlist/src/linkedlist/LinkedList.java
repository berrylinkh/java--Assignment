package linkedlist;

public class LinkedList {
    private Node head;
    private  int size;

    public Node getHead(){
        return head;
    }
    public int getSize(){
        return size;
    }
    public void setHead(Node head){
        this.head = head;
    }
    public void setSize(int size){
        this.size = size;
    }

    public void append(String data) {
        Node mynewNode = new Node(data);
        if (this.head == null) {
            this.head = mynewNode;
        }
        else {
            Node current = this.head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(mynewNode);
        }
        size++;
    }

    public void prepend(String data) {
        Node mynewNode = new Node(data);
        if (this.head == null) {
            this.head = mynewNode;
        }
        else {
            mynewNode.setNext(this.head);
            this.head = mynewNode;
        }
        size++;
    }

    public void insert(String data, int index) {
        int count =0;
        Node mynewNode = new Node(data);
        if (this.head == null) {
            this.head = mynewNode;
        }
        Node current = this.head;
        while (count < index-1) {
            current = current.getNext();
            count++;
        }
        mynewNode.setNext(current.getNext());
        current.setNext(mynewNode);
        size++;
    }

    public String pop(String data) {
        String remove;
        Node mynewNode = new Node(data);
        if (this.head == null) {
            this.head = mynewNode;
        }
        else if (this.head.getNext() == null) {
             remove = this.head.getData();
            this.head = null;
            this.size --;
            return remove;
        }
        return null;
    }

    public String popAt(int index) {
            String pop;
            if (this.head == null) {
                return null;
            }

            if (index == 0) {
                pop = this.head.getData();
                this.head = this.head.getNext();
                this.size--;
                return pop;
            }

            int count = 0;
            Node current = this.head;

            while (count < index - 1) {
                current = current.getNext();
                count++;
            }

            String remove = current.getNext().getData();
            current.setNext(current.getNext().getNext());
            this.size--;

            return remove;

    }
}
