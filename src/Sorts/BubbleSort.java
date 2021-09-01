package Sorts;

public class BubbleSort{

    private void Swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public int[] Sort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length-i-1; j++){
                if(array[j] > array[j + 1])
                    Swap(array, j, j + 1);
            }
        }
        return array;
    }
}
