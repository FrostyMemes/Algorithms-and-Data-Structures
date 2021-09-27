package Sorts;

public class CombSort {

    final double FACTOR = 1.247;

    public int[] Sort(int[] array){

        final int l = array.length;
        double gapFactor = l / FACTOR;

        while (gapFactor > 1) {

            int gap = (int)Math.round(gapFactor);

            for (int i = 0, j = gap; j < l; i++, j++) {
                if (array[i] > array[j])
                    swap(array,i,j);
            }

            gapFactor = gapFactor / FACTOR;
        }
        return array;
    }



    private void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
