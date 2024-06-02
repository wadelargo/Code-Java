public class IntsinglyLinkedList {
    Node head, tail;
   
    public void IntSinglyLinkedList() {
        head = tail = null;
    }

    public void addToTail(int data) {
        if(head==null) {
            Node n = new Node(data, null);
            head = n;
            tail = n;
        }else {
            tail.next = new Node(data, null);
            tail = tail.next;
        }
    }

    public void addTohead(int data) {
        if(heat==null) {
            Node n = new Node(data, null);
            head = n;
            tail = n;
        }else {
            head = new Node(data, head);
        }
    }
    
    //Traversal of data and print to screem
    public void showData() {
        System.out.print("[");
        for(Node tmp = head; tmp!=null; tmp=tmp.next) {
            System.out.print(tmp.data + ",");
    }
    class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.data = next;
        }
    }
}