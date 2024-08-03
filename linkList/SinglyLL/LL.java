package linkList.SinglyLL;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp= temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node= new Node(val);
        tail.next= node;
        tail = node;
        size++;
    }

    public void insert (int val, int index){
        if (index==0) {
            insertFirst(val);
        }
        if (index==size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;

        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
//----------Questions--------------------------------------------------
    public void deleteDuplicates(){
        Node node = head;   //we'll start from head 
        
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }

        tail= node;
        tail.next= null; 
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.display();
        list.deleteDuplicates();
        list.display();

    }




}