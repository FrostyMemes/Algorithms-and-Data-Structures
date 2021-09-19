package Sorts;

public class BinaryTreeSort {

    public BinaryTreeSort left;
    public BinaryTreeSort right;
    public int key;

    public BinaryTreeSort(int[] array)
    {
        this.key = array[0];
        for (int i = 1; i < array.length; i++) {
            insert(new BinaryTreeSort(array[i]));
        }
    }

    public BinaryTreeSort(int key) {

        this.key = key;
    }

    public void insert(BinaryTreeSort aTree) {

        if (aTree.key < key)
            if (left != null) left.insert(aTree);
            else left = aTree;
        else if (right != null) right.insert(aTree);
        else right = aTree;
    }

    public void Print(Printer visitor) {

        if (left != null) left.Print(visitor);
        visitor.visit(this);
        if (right != null) right.Print(visitor);
    }

    public static class Printer {

        public void visit(BinaryTreeSort node) {
            System.out.print(" " + node.key);
        }
    }

}



