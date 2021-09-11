package DataStructures;

public class Deque {

    Node First;
    Node Last;

    class Node <T> {

        Node next;
        Node prev;
        T item;

        Node(T item, Node next, Node prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    public Deque(){
        First = null;
        Last = null;
    }



}
