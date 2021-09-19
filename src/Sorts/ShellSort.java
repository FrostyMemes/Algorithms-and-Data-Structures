package Sorts;

public class ShellSort {

    public int[] Sort(int[] array) {

        int h = fStep(array);

        for (int step = h; step > 0; step = (step - 1) / 3)
            for (int i = step; i < array.length; i++)
                for (int j = i; j >= step && array[j] < array[j - step]; j -= step)
                    swap(array, j, j - step);

        return array;
    }

    private int fStep(int[] array) {

        int h = 0;
        while (h <= array.length / 3)
            h = 3 * h + 1;
        return h;
    }

    private void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
