package Sorts;

public class BinaryTreeSort {

    public BinaryTreeSort left;       //Левый сын
    public BinaryTreeSort right;      //Правый сын
    public int key;         //Значение

    public BinaryTreeSort(int key)    //Конструктор для узла дерева
    {
        this.key = key;
    }

    public void insert(BinaryTreeSort aTree)      //Вставка
    {
        if (aTree.key < key)
            if (left != null) left.insert(aTree);
            else left = aTree;
        else
        if (right != null) right.insert(aTree);
        else right = aTree;
    }

    public void Print(Printer visitor)  //Распечатывание инфиксной записью
    {
        if (left != null)  left.Print(visitor);
        visitor.visit(this);
        if (right != null) right.Print(visitor);
    }

    class Printer                           //Класс для распечатывания
    {
        public void visit(BinaryTreeSort node)
        {
            System.out.print(" " + node.key);
        }
    }

}



