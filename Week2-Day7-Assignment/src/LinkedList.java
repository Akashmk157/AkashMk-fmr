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
    public void addAt(int data, int position) {
        Node newNode = new Node(data);
        Node tmp = head;
        int index = 0;

        for(int i=0; i<=position; i++){
            if(i==position-1){
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

    public Node reverseLL(){
        Node curr = head, prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
