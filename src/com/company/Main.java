package com.company;

import Sorts.BinaryTreeSort;
import Sorts.MergeSort;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[] {6,1,7,5,3,3,6,8,9};
        BinaryTreeSort sort = new BinaryTreeSort(a);
        sort.Print(new BinaryTreeSort.Printer());
    }
}

