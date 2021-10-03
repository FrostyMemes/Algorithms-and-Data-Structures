package Sorts;

public class GnomeSort {


    public int[] Sort(int[] array){

        for(int i=0; i<array.length; i++)
            if(i!=0)
                if(array[i-1]>array[i]) {
                    swap(array, i - 1, i);
                    i-=2;
                }
        return array;
    }


    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}


