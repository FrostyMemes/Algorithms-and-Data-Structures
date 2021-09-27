package com.company;


import DataStructures.BinaryHeap;
import DataStructures.Deque;
import Sorts.*;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {111,100,30,2,54,65,23,89,1111,2343};
        CombSort sorter = new CombSort();
        sorter.Sort(array);
        print(array);
    }

    static public void print(int[] array){
        for (int i:
             array) {
            System.out.printf("%d ",i);
        }
    }
}

