package DataStructures;

public class Deque<T> {

    Node Front;
    Node Back;

    private class Node <T> {

        Node next;
        Node prev;
        T item;

        Node(T item, Node prev, Node next) {

            this.item = item;
            this.prev = prev;
            this.next = next;
        }
    }

    public Deque(){

        Front = null;
        Back = null;
    }

    public boolean IsEmpty(){

        return Front == null;
    }

    public void PushBack(T item){

        Back = new Node(item, null, Back);

        if (Back.next!=null)
            Back.next.prev = Back;

        if (Front==null)
            Front = Back;
    }

    public void PushFront(T item){

        Front = new Node(item, Front, null);

        if (Front.prev!=null)
            Front.prev.next = Front;

        if (Back == null)
            Back = Front;
    }

    public T PopBack(){

        T result = null;
        if(!IsEmpty()){
            result = (T)Back.item;
            if(Front == Back){
                Front = null;
                Back = null;
            } else
                Back = Back.next;

        }
        return result;
    }

    public T PopFront(){

        T result = null;
        if(!IsEmpty()){
            result = (T)Front.item;
            if(Front == Back){
                Front = null;
                Back = null;
            } else
                Front = Front.prev;

        }
        return result;
    }

    public void  Clear(){
        while(Front!=null)
            PopBack();
    }
}
