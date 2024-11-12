package linkList.DoublyLL;

public class DLL {
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void size() {
        System.out.println(size);
    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next= head;
        node.prev= null;
        if (head!= null) {
            head.prev= node;
        }
        head = node;
        size++;
    }
    public void insertLast(int val){
        Node node= new Node(val);
        Node last = head;
        node.next =null;
        if (head == null) {
            node.prev=null;
            head= node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next= node;
        node.prev= last;
        size++;
    }
    public void insert(int after, int val){ //inserting a node after a node with value=val
        Node p= findNode(after);
        
    }

    public Node findNode(int val){
        Node node= head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
