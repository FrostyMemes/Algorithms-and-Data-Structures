package Sorts;

public class FastSort {

        public int[] Sort(int[] array){
            quickSort(array,0,array.length-1);
            return array;
        }
        private void quickSort(int [] array, int from, int to){
            if (from<to) {
                int divideIndex = partition(array, from, to);
                quickSort(array, from, divideIndex - 1);
                quickSort(array, divideIndex, to);
            }
        }
        private int partition(int[] array, int from, int to){
            int rightIndex=to;
            int leftIndex = from;

            int pivot = array[from];
            while (leftIndex<=rightIndex){

                while(array[leftIndex]<pivot)
                    leftIndex++;
                while(array[rightIndex]>pivot)
                    rightIndex--;

                if (leftIndex<=rightIndex){
                    swap(array, rightIndex, leftIndex);
                    leftIndex++;
                    rightIndex--;
                }

            }
            return leftIndex;
        }

        private void swap(int[] array,int index1, int index2){
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
}
