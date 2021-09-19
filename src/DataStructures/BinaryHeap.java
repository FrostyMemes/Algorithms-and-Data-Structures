package DataStructures;
import java.util.ArrayList;


public class BinaryHeap {

    private ArrayList<Integer> Heap;

    public BinaryHeap(){
        Heap = new ArrayList<>();
    }
    public BinaryHeap(int[] array){
        Heap = new ArrayList<>();
        buildHeap(array);
    }

    public int heapSize(){
        return Heap.size();
    }

    public void add(int item){
        Heap.add(item);
        int i = Heap.size()-1;
        int parent = (i-1)/2;

        while (i > 0 && Heap.get(parent) < Heap.get(i))
        {
            swap(Heap, i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }

    public void heapify(int i) {
        int leftChild;
        int rightChild;
        int largestChild;

        for (;;)
        {
            leftChild = 2 * i + 1;
            rightChild = 2 * i + 2;
            largestChild = i;

            if (leftChild < heapSize() && Heap.get(leftChild) > Heap.get(largestChild))
                largestChild = leftChild;

            if (rightChild < heapSize() && Heap.get(rightChild) > Heap.get(largestChild))
                largestChild = rightChild;

            if (largestChild == i)
                break;

            swap(Heap, i, largestChild);
            i = largestChild;
        }

    }

    public void buildHeap(int[] sourceArray)
    {
        for (int i:
                sourceArray) {
            add(i);
        }
    }


    public int getMax()
    {
        int result = Heap.get(0);
        Heap.set(0,Heap.get(heapSize()-1));
        Heap.remove(heapSize()-1);
        heapify(0);
        return result;
    }

    public int printItem(int index){
        return Heap.get(index);
    }


    private void swap(ArrayList<Integer> Heap ,int index1, int index2){
        int temp = Heap.get(index1);
        Heap.set(index1, Heap.get(index2));
        Heap.set(index2, temp);
    }


}
