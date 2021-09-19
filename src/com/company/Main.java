package com.company;


import DataStructures.BinaryHeap;
import DataStructures.Deque;
import Sorts.*;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {111,100,30};
        Deque<Integer> Deq = new Deque<Integer>();
        for (int i:
             array) {
            Deq.PushBack(i);
        }
        while (!Deq.IsEmpty()){
            int res = Deq.PopBack();
            System.out.print(res+" ");
        }
    }

    static public void print(int[] array){
        for (int i:
             array) {
            System.out.printf("%d ",i);
        }
    }
}

