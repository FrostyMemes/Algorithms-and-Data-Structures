package com.company;

import DataStructures.Queue;
import DataStructures.Stack;
import Sorts.*;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[] {111,100};
        ShellSort sorting = new ShellSort();
        array1=sorting.Sort(array1);
        print(array1);

    }

    static public void print(int[] array){
        for (int i:
             array) {
            System.out.printf("%d ",i);
        }
    }
}

