public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(size==0){
            tail = newNode;
        }
        size++;
    }

    public void removeAt(int index){
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node tmp = head;
        if (index == 0) {
            head = tmp.next;
            return;
        }
        for (int i=0; tmp!=null && i<index-1; i++) {
            tmp = tmp.next;
        }
        if (tmp == null || tmp.next == null) {
            return;
        }
        tmp.next = tmp.next.next;
    }

    public void addAt(int data, int position) {
        Node newNode = new Node(data);
        Node tmp = head;
        int index = 0;

        for(int i=0; i<=position; i++){
            if(i==position){
                newNode.next = tmp.next;
                tmp.next = newNode;
                size++;
            }
            tmp = tmp.next;
        }

    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(size==0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }
    public void display(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data + " --> ");
            tmp = tmp.next;
        }
    }
    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
}
