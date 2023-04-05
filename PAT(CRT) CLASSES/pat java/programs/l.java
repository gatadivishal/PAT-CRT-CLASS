class Node {
    int data;// to store data
    Node next;// to store next address

    public Node(int value) {// creating constrctor
        this.data = value;
        next = null;
    }
}

class Linkedlist {
    public void addElement(Node head,int data){
        Node new_node = new node(data);
        Node cur =head;
        while(cur.next !=null)
        {
            System.out.println(cur.data+"-->")
            cur=cur.next;

        }
        cur.next = new_node;
        }

    public void delete() {

    }

    public void printlist() {

    }
}

public class linkedlist {
    public static void main(String[] args) {
        Linkedlist LL = new Linkedlist();
        Node head = new Node(10);
        LL.addElement(20);
        LL.addElement(30);
        LL.addElement(40);
        LL.printlist(head);
        // System.out.println("Linked List")

    }

}
