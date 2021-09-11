package Sorts;

public class ShackeSort {

    public int[] Sort (int[] array){
        int Left = 0, Right = array.length - 1;

        while (Left<Right)
        {
            for (int i = Left; i < Right; i++)
            {
                if (array[i] > array[i + 1])
                    swap(array,i,i+1);
            }
            Right--;
            for (int i = Right; i > Left; i--)
            {
                if (array[i-1] > array[i])
                    swap(array, i-1,i);
            }
            Left++;
        }
        return array;
    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
