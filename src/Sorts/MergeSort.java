package Sorts;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public int[] Sort(int[] array) //Сортировка
    {

        if (array.length == 1)
        {
            return array;
        }

        int middle = array.length / 2;
        return Merge(Sort(Arrays.copyOfRange(array, 0, middle)), Sort(Arrays.copyOfRange(array, middle, array.length))); //Метод Skip() пропускает определенное количество элементов, а метод Take() извлекает определенное число элементов.
    }

    private int[] Merge(int[] arr1, int[] arr2) //Слияние
    {

        int[] merged = new int[arr1.length + arr2.length];
        int i1 = 0, i2 = 0;

        for (int i = 0; i < merged.length; ++i)
        {
            if (i1 < arr1.length && i2 < arr2.length)
            {
                merged[i] = arr1[i1] > arr2[i2] ? arr2[i2++] : arr1[i1++];
            }
            else
            {
                merged[i] = i2 < arr2.length ? arr2[i2++] : arr1[i1++];
            }
        }
        return merged;
    }


}
