package DataStructures;

public class Stack <T>{

    Node Head;

    class Node <T> {

        Node next;
        T item;

        Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

   public Stack(){
        Head = null;
    }

    public boolean Empty(){
        return Head == null;
    }

    public void Push(T item){
        Head = new Node(item, Head);
    }

    public T Pop() {

        T item = null;
        if (!Empty()) {
            item = (T) Head.item;
            Head = Head.next;
        }
        return item;
    }

    public T getHead(){
        if(!Empty())
            return (T) Head.item;
        else
            return null;
    }

    public void Clear(){
        while (!Empty())
            Pop();
    }

    public int Size(){
        int itemCount = 0;
        Node pNode = Head;
        while(pNode!=null) {
            pNode = pNode.next;
            itemCount++;
        }
        return itemCount;
    }
}
