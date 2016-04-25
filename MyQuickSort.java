/*
 * based on integer version of the algorithm from 
 * http://www.java2novice.com/java-sorting-algorithms/quick-sort/
 */

public class MyQuickSort {
     
    private Point3D array[];
    private int length;
 
    public void sort(Point3D[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        Point3D pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i].distance() < pivot.distance()) {
                i++;
            }
            while (array[j].distance() > pivot.distance()) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        Point3D temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
     
    public static void main(String a[]){
         
        MyQuickSort sorter = new MyQuickSort();
        Point3D[] input = {new Point3D(2,2,3), new Point3D(3,3,2), new Point3D(1,1,2)};
        sorter.sort(input);
        for(Point3D p:input){
            System.out.print(p);
            System.out.print(" ");
        }
    }
}

