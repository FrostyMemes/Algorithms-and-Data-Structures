package com.company;

import Sorts.BinaryTreeSort;
import Sorts.BubbleSort;
import Sorts.MergeSort;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[] {6,1,7,5,3,3,6,8,9};
        BubbleSort Sorter = new BubbleSort();
        int[] array2 = Sorter.Sort(array1);
        print(array2);
    }

    static public void print(int[] array){
        for (int i:
             array) {
            System.out.printf("%d ",i);
        }
    }
}

