package Sorts;

public class FastSort {

        public int[] Sort(int[] array){
            quickSort(array,0,array.length-1);
            return array;
        }

        private void quickSort(int [] array, int leftBorder, int rightBorder){
            int leftMarker = leftBorder;
            int rightMarker = rightBorder;
            int pivot = array[(leftMarker + rightMarker) / 2];
            do {
                while (array[leftMarker] < pivot)
                    leftMarker++;


                while (array[rightMarker] > pivot)
                    rightMarker--;


                if (leftMarker <= rightMarker) {

                    if (leftMarker < rightMarker)
                        swap(array, leftMarker, rightMarker);
                    leftMarker++;
                    rightMarker--;
                }
            } while (leftMarker <= rightMarker);


            if (leftMarker < rightBorder) {
                quickSort(array, leftMarker, rightBorder);
            }
            if (leftBorder < rightMarker) {
                quickSort(array, leftBorder, rightMarker);
            }
        }

        private void swap(int[] array,int index1, int index2){
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
}
