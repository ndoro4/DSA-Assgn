class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node start;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = start;
        start = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
            return;
        }
        Node temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteFromBeginning() {
        if (start != null) {
            start = start.next;
        }
    }

    public void display() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        list.display();

        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.display();

        list.deleteFromBeginning();
        list.display();
    }
}