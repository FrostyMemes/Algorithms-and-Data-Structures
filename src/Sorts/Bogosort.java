package Sorts;

public class Bogosort {


    public int[] Sort(int[] array) {
        while (!correct(array))
            shuffle(array);
        return array;
    }

    private boolean correct(int[] array) {
        int size = array.length;
        while (size-- > 0)
            if (array[size - 1] > array[size])
                return false;
        return true;
    }

   private void shuffle(int[] array) {
        for (int i = 0; i < array.length; ++i)
            swap(array, array[i], array[rnd(0, array.length)]);
    }

    private void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
