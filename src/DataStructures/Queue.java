package DataStructures;

public class Queue <T>{

    Node Front;
    Node Back;

    class Node <T> {

        Node next;
        T item;

        Node(T item, Node next){
            this.item = item;
            this.next = next;
        }
    }

    public Queue(){
        Front = null;
        Back = null;
    }

    public boolean Empty(){
        return Front == null;
    }

    public void Push(T item){
        Node nNode = new Node(item, null);
        if(Front==null)
            Front = nNode;
        else
            nNode.next = Back;

        Back = nNode;
    }

    public T Poll(){

        T item = null;
        if (!Empty()) {
            item = (T) Front.item;
            if (Front!=Back) {
                Node pNode = Back;
                while (pNode.next != Front)
                    pNode = pNode.next;
                Front = pNode;
            }
            else{
                Front = null;
                Back = null;
            }
        }
        return item;
    }

    public T Peek(){
        if (!Empty())
            return (T)Front.item;
        else
            return null;
    }


    public void Clear(){
        while (!Empty())
            Poll();
    }

    public int Size(){
        int itemCount = 0;
        Node pNode = Back;
        while(pNode!=null) {
            pNode=pNode.next;
            itemCount++;
        }
        return itemCount;
    }
}
