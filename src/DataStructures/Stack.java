package DataStructures;

public class Stack <T>{

    class Node <T> {

        Node next;
        T item;

        Node(T item, Node prev){
            this.item = item;
            this.next = prev;
        }
    }

    Node Head;

    Stack(){
       Head = null;
    }

    public boolean Empty(){
        return Head == null;
    }

    public void Push(T item){
        Head = new Node(item, Head);
    }

    public T Pop() {
        T result = (T) Head.item;
        Head = Head.next;
        return result;
    }

    public T getHead(){
        return (T) Head.item;
    }

    public void Clear(){
        while (!Empty())
            Pop();
    }
}
