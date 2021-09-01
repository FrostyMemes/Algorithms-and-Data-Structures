package DataStructures;

public class BinaryTree {


        public BinaryTree left;
        public BinaryTree right;
        public int key;

        public BinaryTree(int[] array)
        {
            this.key = array[0];
            for (int i = 1; i<array.length; i++) {
                insert(new BinaryTree(array[i]));
            }
        }
        public BinaryTree(int key)
        {
            this.key = key;
        }

        public void insert(BinaryTree aTree)
        {
            if (aTree.key < key)
                if (left != null) left.insert(aTree);
                else left = aTree;
            else
            if (right != null) right.insert(aTree);
            else right = aTree;
        }

}
