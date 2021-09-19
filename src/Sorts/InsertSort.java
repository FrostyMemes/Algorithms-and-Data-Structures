package Sorts;

public class InsertSort {


    public int[] Sort (int[] array){

        for(int i=1;i<array.length;i++)
            for(int j=i;j>0 && array[j-1]>array[j];j--)
                swap(array, j-1, j);
      return array;
    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
